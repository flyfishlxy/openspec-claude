## Why

提供用户查询接口，支持通过用户ID获取用户基本信息（userId、name、age），实现用户数据的统一访问入口。

## What Changes

- 新增 `GET /api/users/{userId}` 接口
- 返回用户信息：userId、name、age
- 参数校验：userId <= 0 返回 INVALID_PARAM
- 用户不存在返回 USER_NOT_FOUND
- 统一返回结构 ApiResponse

## Capabilities

### New Capabilities

- `get-user-by-id`: 根据用户ID查询用户信息

### Modified Capabilities

<!-- 暂无现有能力修改 -->

## Impact

- 新增 Controller 层接口
- 新增 Domain 层实体和规则
- 新增 Infrastructure 层数据访问
- 新增 UserDTO 用于返回数据
