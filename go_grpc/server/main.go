package main

import (
	"context"
	"log"
	"net"

	"google.golang.org/grpc"

	pb "github.com/earmarques/tcc_grpc/go_grpc/protos"
	emptypb "google.golang.org/protobuf/types/known/emptypb"
)
const (
	port = ":50051"
)
var id int32 = 0
// Stub
type server struct {
	pb.UnimplementedGeradorIDServer
}
// Implementação do método
func (s *server) GerarId(ctx context.Context, in *emptypb.Empty) (*pb.IdReply, error) {
	id++
	log.Printf("🦫 Id=%d", id)
	return &pb.IdReply{GoId: id}, nil
}

func main() {
	// Canal gRPC
	lis, err := net.Listen("tcp", port)
	if err != nil {
		log.Fatalf("Falha ao escutar a conexão: %v", err)
	}
	// Instancia o servidor
	s := grpc.NewServer()
	pb.RegisterGeradorIDServer(s, &server{})

	log.Printf("🦫 Servidor Go ouvindo na porta %s", port)

	if err := s.Serve(lis); err != nil {
		log.Fatalf("Falha ao prestar o serviço: %v", err)
	}
}

