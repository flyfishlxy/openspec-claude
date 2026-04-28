# AGENTS.md

## 工作模式

本项目采用 OpenSpec + Claude Code 进行规格驱动开发。

所有功能变更必须通过 OpenSpec change 进行管理。

## 强制流程

1. 创建 openspec/changes/<change-id>
2. 编写 proposal.md
3. 编写 design.md
4. 编写 specs/<feature>/spec.md
5. 编写 tasks.md
6. 用户确认
7. 按 tasks 实现代码
8. 更新 tasks 状态
9. 执行测试
10. 归档 change

## 禁止行为

- 禁止无 change 修改代码
- 禁止修改无关文件
- 禁止 Controller 写业务逻辑
- 禁止跳过测试
- 禁止直接操作数据库

## 分层规范

controller -> application -> domain -> infrastructure

controller：入参校验、返回结果  
application：流程编排  
domain：业务规则  
infrastructure：数据库/外部系统

## OpenSpec 约束

每个 change 必须包含：

- proposal.md
- design.md
- tasks.md
- specs

规格必须使用 Given / When / Then