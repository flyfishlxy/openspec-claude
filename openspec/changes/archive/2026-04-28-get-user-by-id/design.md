## Context

Spring Boot 四层架构项目：
- Controller 层：接收 HTTP 请求，参数校验，调用 Application
- Application 层：编排业务逻辑
- Domain 层：核心业务规则和实体
- Infrastructure 层：数据访问实现

## Goals / Non-Goals

**Goals:**
- 实现 GET /api/users/{userId} 接口
- 参数校验：userId <= 0 返回 INVALID_PARAM
- 用户不存在返回 USER_NOT_FOUND
- 统一返回 ApiResponse 结构

**Non-Goals:**
- 不实现用户创建/修改/删除
- 不实现分页查询
- 不实现数据库持久化（暂使用内存模拟）

## Decisions

### 1. 返回结构
```
ApiResponse<T>
├── code: String (SUCCESS/INVALID_PARAM/USER_NOT_FOUND)
├── message: String
└── data: T
```

### 2. 目录结构
```
src/main/java/com/example/demo/
├── controller/
│   └── UserController.java
├── application/
│   └── UserService.java
├── domain/
│   ├── entity/
│   │   └── User.java
│   ├── exception/
│   │   └── UserNotFoundException.java
│   └── service/
│       └── UserDomainService.java
├── infrastructure/
│   └── repository/
│       └── UserRepository.java
├── dto/
│   ├── UserDTO.java
│   └── ApiResponse.java
└── config/
    └── AppConfig.java
```

### 3. 错误码定义
- `SUCCESS`: 成功
- `INVALID_PARAM`: 参数错误（userId <= 0）
- `USER_NOT_FOUND`: 用户不存在

## Risks / Trade-offs

<!-- 暂无已知风险 -->
