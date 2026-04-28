# 隐性业务约定

## 通用约定

- API 统一返回 ApiResponse
- Controller 不允许直接调用 Repository
- Controller 不允许写业务规则
- Domain 不依赖 Spring MVC
- 新增接口必须补测试