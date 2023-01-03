package main

import (
	"context"
	"log"
	"time"

	"google.golang.org/grpc"

	pb "github.com/earmarques/tcc_grpc/go_grpc/protos"
	emptypb "google.golang.org/protobuf/types/known/emptypb"
)

const (
	address = "localhost:50051"
)

func main() {
	// Set up a connection to the server.
	conn, err := grpc.Dial(address, grpc.WithInsecure(), grpc.WithBlock())
	if err != nil {
		log.Fatalf("Não foi possível estabelecer conexão com o servidor gRPC: %v", err)
	}
	defer conn.Close()
	c := pb.NewGeradorIDClient(conn)

	ctx, cancel := context.WithTimeout(context.Background(), time.Second)
	defer cancel()
	r, err := c.GerarId(ctx, &emptypb.Empty{})
	if err != nil {
		log.Fatalf("Não foi possível gerar o id: %v", err)
	}
	var id = r.GetGoId()
	log.Printf("🦫 ID gerado: %d", id)
	//log.Printf("Não foi possível gerar o id: %v", r)
}

