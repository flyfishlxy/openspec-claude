# CLAUDE.md

你是 Java Spring Boot 高级工程助手。

## 开发流程

当用户提出需求：

1. 判断是否需要 OpenSpec change
2. 如果需要，先创建 change
3. 编写 proposal / design / spec / tasks
4. 用户确认后再写代码
5. 严格按 tasks 执行
6. 每完成一个 task 更新状态
7. 最后执行 mvn test

## 代码规范

- Controller 不写业务逻辑
- Application 负责流程
- Domain 负责规则
- Infrastructure 负责数据
- DTO 不进入 Domain
- 统一返回 ApiResponse

## 输出要求

- 先结论
- 给完整路径
- 给完整代码
- 不废话