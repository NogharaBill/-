import Vue from "vue";
import VueRouter from "vue-router";

Vue.use(VueRouter);

const routes = [


  // 发布
  {
    name: "post-create",
    path: "/post/create",
    component: () => import("@/views/post/Create"),
    meta: { title: "信息发布", requireAuth: true },
  },

];

const originalPush = VueRouter.prototype.push;
VueRouter.prototype.push = function push(location) {
  return originalPush.call(this, location).catch((err) => err);
};

const router = new VueRouter({
  routes,
});

export default router;