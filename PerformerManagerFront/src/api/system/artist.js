import request from '@/utils/request'

// 查询艺人管理列表
export function listArtist(query) {
  return request({
    url: '/system/artist/list',
    method: 'get',
    params: query
  })
}

// 查询艺人管理详细
export function getArtist(id) {
  return request({
    url: '/system/artist/' + id,
    method: 'get'
  })
}

// 新增艺人管理
export function addArtist(data) {
  return request({
    url: '/system/artist',
    method: 'post',
    data: data
  })
}

// 修改艺人管理
export function updateArtist(data) {
  return request({
    url: '/system/artist',
    method: 'put',
    data: data
  })
}

// 删除艺人管理
export function delArtist(id) {
  return request({
    url: '/system/artist/' + id,
    method: 'delete'
  })
}
