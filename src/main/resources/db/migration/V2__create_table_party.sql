
CREATE TABLE tb_party(
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL UNIQUE,
    description TEXT NOT NULL,
    location VARCHAR(255) NOT NULL,
    date_party TIMESTAMP NOT NULL,
    capacity INTEGER NOT NULL,
    type_party VARCHAR(255) NOT NULL
);