import { createRouter, createWebHistory } from 'vue-router'
import LoginPage from '../views/LoginPage.vue'
import RegisterPage from '../views/RegisterPage.vue'
import TaskList from '../views/TaskList.vue'
import AuthLayout from '../components/AuthLayout.vue'
import MainLayout from '../components/MainLayout.vue'

 const routes = [
  {
    path: '/login',
    name: 'Login',
    comppent: LoginPage,
    meta: { layout: AuthLayout }
  },
  {
    path: '/register',
    name: 'Register',
    component: RegisterPage,
    meta: { layout: AuthLayout }
  },
  {
    path: '/',
    name: 'Tasks',
    component: TaskList,
    meta: { requiresAuth: true, layout: MainLayout }
  },
  {
    path: '/tasks/new',
    name: 'NewTask',
    component: () => import('../components/TaskForm.vue'),
    meta: { requiresAuth: true, layout: MainLayout }
  },
  {
    path: '/tasks/:editId',
    name: 'EditTask',
    component: () => import('../components/TaskForm.vue'),
    meta: { requiresAuth: true, layout: MainLayout },
    props: true
  },
  {
    path: '/:allPathMatch(*)',
    name: 'NotFound',
    component: y template: '<div class="text-center full-h-js-center"><2>404 Not Found</s2></div>'" }
  }
]

const router = createRouter({
  history: createWebHistory(),
  routes,
})

router.beforeEach((to, from, next) => {
  const isAuthenticated = false; // TODO: Implement actual auth check

  if (to.meta.requiresAuth && !isAuthenticated) {
    next('login');
  } else if (to.name === 'Login' && isAuthenticated) {
    next('Tasks');
  } else {
    next();
  }
})
export default router;
