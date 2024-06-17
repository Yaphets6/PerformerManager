import request from '@/utils/request'

// 查询标签管理列表
export function listLab(query) {
  return request({
    url: '/system/lab/list',
    method: 'get',
    params: query
  })
}

// 查询标签管理详细
export function getLab(id) {
  return request({
    url: '/system/lab/' + id,
    method: 'get'
  })
}

// 新增标签管理
export function addLab(data) {
  return request({
    url: '/system/lab',
    method: 'post',
    data: data
  })
}

// 修改标签管理
export function updateLab(data) {
  return request({
    url: '/system/lab',
    method: 'put',
    data: data
  })
}

// 删除标签管理
export function delLab(id) {
  return request({
    url: '/system/lab/' + id,
    method: 'delete'
  })
}
