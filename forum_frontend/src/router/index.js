import Vue from 'vue'
import VueRouter from 'vue-router'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'Home',
    component: () => import('@/views/Home')
  },
  {
    path: '/register',
    name: 'register',
    component: () => import('@/views/auth/Register'),
    meta: {title: '注册'}
  },
  {
    path: '/login',
    name: 'login',
    component: () => import('@/views/auth/Login'),
    meta: {title: '登录'}
  },
  {
    path: '/404',
    name: '404',
    component: () => import('@/views/error/404'),
    meta: {title: '404-Notfound,界面没有'}
  },
  // 发布
  {
    name: "post-create",
    path: "/post/create",
    component: () => import("@/views/post/Create"),
    meta: { title: "信息发布", requireAuth: true },
  },
  // 详情
  {
    name: "post-detail",
    path: "/post/:id",
    component: () => import("@/views/post/Detail"),
    meta: { title: "详情" },
  },
  {
    path: '*',
    redirect: '/404',
    hidden: true
  }
]

const originalPush = VueRouter.prototype.push;
VueRouter.prototype.push = function push(location) {
  return originalPush.call(this, location).catch((err) => err);
  //捕捉异常，就不再抛出异常
};

const router = new VueRouter({
  routes
})

export default router
