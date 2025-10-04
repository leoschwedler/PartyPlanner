# PartyPlanner 🎉

**PartyPlanner** é um projeto backend em Java que permite criar, gerenciar e buscar festas de forma rápida e escalável, aplicando **Clean Architecture** e boas práticas de desenvolvimento.  

A camada de **Core** é pura Java, sem depender de Spring ou qualquer infraestrutura externa, tornando o código mais limpo, testável e modular.  

---

## Tecnologias

- **Java 17 & Spring Boot**  
- **PostgreSQL** (desenvolvimento) e **H2** (produção)  
- **Redis** para cache de parties  
- **Spring Security** para autenticação e geração de tokens  
- **JUnit** para testes de integração  
- **Docker Compose** para orquestrar PostgreSQL e Redis  
- **Deploy na AWS EC2** via **GitHub Actions**

---

## Funcionalidades

- Criar, editar e deletar festas  
- Buscar festas por nome  
- Listar todas as festas  
- Cache em Redis para otimizar consultas  
- Proteção de endpoints com tokens via Spring Security  
- Testes automatizados com JUnit  

---

## Como rodar o projeto localmente

1. Clone o repositório:

```bash
git clone https://github.com/seuusuario/partyplanner.git
cd partyplanner
