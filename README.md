



docker run -d --name postgres --rm -p 5432:5432 -e POSTGRES_PASSWORD=password postgres

psql -h localhost -p 5432 -U postgres
