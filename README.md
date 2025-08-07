# spring-boot-ai
  # ollama
  1. curl --location 'localhost:8080/api/chat' \
  --header 'Content-Type: text/plain' \
  --data 'Explain Spring Boot in simple terms.'

  # chat-gpt
  1. curl --location 'http://localhost:8080/api/chat/ask?prompt=Tell%20me%20a%20joke'
  2. curl --location 'localhost:8080/api/chat'
  --header 'Content-Type: text/plain'
  --data 'Explain Spring Boot in simple terms.'
  3. curl --location 'localhost:8080/post'
  --header 'Content-Type: application/json'
  --header 'Accept: application/json'
  --data '{ "name": "abc", "category": "abc", "price": 191.0 }'
