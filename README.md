# openspec-claude

一个基于 Spring Boot 3 和 Java 17 的示例项目，用于演示在 OpenSpec + Claude Code 流程下进行规格驱动开发。

## 项目说明

- 技术栈：Java 17、Spring Boot 3.3.5、Maven
- 当前能力：提供用户查询接口 `GET /api/users/{userId}`
- 研发流程：所有功能变更通过 `openspec/changes` 管理

## 目录结构

```text
src/main/java/com/flyfish/openspecclaude
├── controller       // 入参校验、返回结果
├── application      // 流程编排
├── domain           // 业务规则
└── infrastructure   // 数据访问、外部系统
```

## 启动项目

```bash
mvn spring-boot:run
```

默认地址：

```text
http://localhost:8080
```

## 运行测试

```bash
mvn test
```

## 接口示例

请求：

```bash
curl http://localhost:8080/api/users/1
```

成功响应示例：

```json
{
  "code": "SUCCESS",
  "message": "success",
  "data": {
    "userId": 1,
    "name": "张三",
    "age": 25
  }
}
```

失败响应示例：

```json
{
  "code": "USER_NOT_FOUND",
  "message": "User not found",
  "data": null
}
```

## OpenSpec 工作流

功能变更需要遵循以下流程：

1. 在 `openspec/changes/<change-id>` 下创建变更
2. 编写 `proposal.md`
3. 编写 `design.md`
4. 编写 `specs/<feature>/spec.md`
5. 编写 `tasks.md`
6. 评审确认后实施代码
7. 更新任务状态并执行测试
8. 完成后归档 change