import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import news from '@/views/modules/news/list'
    import kaoshengbaoming from '@/views/modules/kaoshengbaoming/list'
    import baomingrukou from '@/views/modules/baomingrukou/list'
    import mianshichengji from '@/views/modules/mianshichengji/list'
    import discussbaomingrukou from '@/views/modules/discussbaomingrukou/list'
    import zhuanyexinxi from '@/views/modules/zhuanyexinxi/list'
    import kaoshengchengji from '@/views/modules/kaoshengchengji/list'
    import baomingzhinan from '@/views/modules/baomingzhinan/list'
    import canjiamianshi from '@/views/modules/canjiamianshi/list'
    import kaosheng from '@/views/modules/kaosheng/list'
    import zonghechengji from '@/views/modules/zonghechengji/list'
    import config from '@/views/modules/config/list'
    import mianshitongzhi from '@/views/modules/mianshitongzhi/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/news',
        name: '通知公告',
        component: news
      }
      ,{
	path: '/kaoshengbaoming',
        name: '考生报名',
        component: kaoshengbaoming
      }
      ,{
	path: '/baomingrukou',
        name: '报名入口',
        component: baomingrukou
      }
      ,{
	path: '/mianshichengji',
        name: '面试成绩',
        component: mianshichengji
      }
      ,{
	path: '/discussbaomingrukou',
        name: '报名入口评论',
        component: discussbaomingrukou
      }
      ,{
	path: '/zhuanyexinxi',
        name: '专业信息',
        component: zhuanyexinxi
      }
      ,{
	path: '/kaoshengchengji',
        name: '考生成绩',
        component: kaoshengchengji
      }
      ,{
	path: '/baomingzhinan',
        name: '报名指南',
        component: baomingzhinan
      }
      ,{
	path: '/canjiamianshi',
        name: '参加面试',
        component: canjiamianshi
      }
      ,{
	path: '/kaosheng',
        name: '考生',
        component: kaosheng
      }
      ,{
	path: '/zonghechengji',
        name: '综合成绩',
        component: zonghechengji
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/mianshitongzhi',
        name: '面试通知',
        component: mianshitongzhi
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
