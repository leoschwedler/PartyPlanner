# PartyPlanner 🎉

**PartyPlanner** é um backend em **Java 17 e Spring Boot** que permite criar, gerenciar e buscar festas de forma rápida e escalável, aplicando **Clean Architecture** e boas práticas de desenvolvimento.

A camada de **Core** é **pura Java**, sem depender de Spring ou qualquer infraestrutura externa, tornando o código **limpo, testável e modular**.

---

## 🛠 Tecnologias

- **Java 17 & Spring Boot**  
- **PostgreSQL** (desenvolvimento) e **H2** (teste)  
- **Redis** para cache de festas  
- **Spring Security** para autenticação e tokens JWT  
- **Docker Compose** para orquestrar PostgreSQL e Redis  
- **AWS EC2** para deploy da aplicação  
- **GitHub Actions** para pipeline de CI/CD  

---

## ✨ Funcionalidades

- Criar, editar e deletar festas  
- Buscar festas por nome  
- Listar todas as festas  
- Cache em Redis para otimizar consultas  
- Proteção de endpoints com tokens via Spring Security  
- Testes automatizados com JUnit  

---

## 🚀 Como rodar o projeto localmente

1. Clone o repositório:

```bash
git clone https://github.com/seuusuario/partyplanner.git
cd partyplanner
