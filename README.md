# Create test objects (Windows 10 21H1 without WSL)

```bash
curl -i -H "Content-Type:application/json" -d "{\"firstName\": \"Izku\", \"lastName\": \"Miraiya\", \"heroPower\": 1000}" http://localhost:8080/hero
curl -i -H "Content-Type:application/json" -d "{\"firstName\": \"raka\", \"lastName\": \"Ochao\", \"heroPower\": 250}" http://localhost:8080/hero
```

Usage
---
1. Use ```./mvnw spring-boot:run```  to start the application / Build jar file ```./mvnw clean package```
2. Create one or more hero's (read above)
3. Use ```http://localhost:8080/hero``` to get all hero's or ```http://localhost:8080/hero/{id}``` to get one hero
