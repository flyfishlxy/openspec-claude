## 1. Domain Layer

- [x] 1.1 Create User entity (userId, name, age)
- [x] 1.2 Create UserNotFoundException exception
- [x] 1.3 Create UserDomainService with getUserById method

## 2. Infrastructure Layer

- [x] 2.1 Create UserRepository with in-memory data store
- [x] 2.2 Implement UserDomainService in infrastructure

## 3. Application Layer

- [x] 3.1 Create UserService interface
- [x] 3.2 Implement UserService with UserDomainService

## 4. Controller Layer

- [x] 4.1 Create UserController with GET /api/users/{userId}
- [x] 4.2 Add parameter validation for userId <= 0

## 5. DTO

- [x] 5.1 Create ApiResponse class
- [x] 5.2 Create UserDTO class

## 6. Test

- [x] 6.1 Run mvn test to verify implementation
