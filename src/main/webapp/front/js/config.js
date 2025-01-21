
var projectName = '高校推免报名';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
        name: '我的收藏',
        url: '../storeup/list.html'
}
]


var indexNav = [

{
	name: '报名指南',
	url: './pages/baomingzhinan/list.html'
}, 
{
	name: '报名入口',
	url: './pages/baomingrukou/list.html'
}, 

{
	name: '通知公告',
	url: './pages/news/list.html'
},
]

var adminurl =  "http://localhost:8080/ssmf55y5/admin/dist/index.html";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-medal","buttons":["新增","查看","修改","删除"],"menu":"考生","menuJump":"列表","tableName":"kaosheng"}],"menu":"考生管理"},{"child":[{"appFrontIcon":"cuIcon-newshot","buttons":["新增","查看","修改","删除"],"menu":"报名指南","menuJump":"列表","tableName":"baomingzhinan"}],"menu":"报名指南管理"},{"child":[{"appFrontIcon":"cuIcon-discover","buttons":["新增","查看","修改","删除","查看评论"],"menu":"报名入口","menuJump":"列表","tableName":"baomingrukou"}],"menu":"报名入口管理"},{"child":[{"appFrontIcon":"cuIcon-phone","buttons":["新增","查看","修改","删除"],"menu":"专业信息","menuJump":"列表","tableName":"zhuanyexinxi"}],"menu":"专业信息管理"},{"child":[{"appFrontIcon":"cuIcon-discover","buttons":["查看","删除","审核","考生成绩"],"menu":"考生报名","menuJump":"列表","tableName":"kaoshengbaoming"}],"menu":"考生报名管理"},{"child":[{"appFrontIcon":"cuIcon-skin","buttons":["查看","修改","删除","面试通知"],"menu":"考生成绩","menuJump":"列表","tableName":"kaoshengchengji"}],"menu":"考生成绩管理"},{"child":[{"appFrontIcon":"cuIcon-vipcard","buttons":["查看","删除"],"menu":"面试通知","menuJump":"列表","tableName":"mianshitongzhi"}],"menu":"面试通知管理"},{"child":[{"appFrontIcon":"cuIcon-list","buttons":["查看","审核","面试成绩","删除"],"menu":"参加面试","menuJump":"列表","tableName":"canjiamianshi"}],"menu":"参加面试管理"},{"child":[{"appFrontIcon":"cuIcon-skin","buttons":["查看","删除"],"menu":"面试成绩","menuJump":"列表","tableName":"mianshichengji"}],"menu":"面试成绩管理"},{"child":[{"appFrontIcon":"cuIcon-explore","buttons":["新增","查看","修改","删除"],"menu":"综合成绩","menuJump":"列表","tableName":"zonghechengji"}],"menu":"综合成绩管理"},{"child":[{"appFrontIcon":"cuIcon-skin","buttons":["查看","修改","删除"],"menu":"轮播图管理","tableName":"config"},{"appFrontIcon":"cuIcon-news","buttons":["新增","查看","修改","删除"],"menu":"通知公告","tableName":"news"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-keyboard","buttons":["查看"],"menu":"报名指南列表","menuJump":"列表","tableName":"baomingzhinan"}],"menu":"报名指南模块"},{"child":[{"appFrontIcon":"cuIcon-phone","buttons":["查看","考生报名"],"menu":"报名入口列表","menuJump":"列表","tableName":"baomingrukou"}],"menu":"报名入口模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-discover","buttons":["查看"],"menu":"考生报名","menuJump":"列表","tableName":"kaoshengbaoming"}],"menu":"考生报名管理"},{"child":[{"appFrontIcon":"cuIcon-skin","buttons":["查看"],"menu":"考生成绩","menuJump":"列表","tableName":"kaoshengchengji"}],"menu":"考生成绩管理"},{"child":[{"appFrontIcon":"cuIcon-vipcard","buttons":["查看","参加面试"],"menu":"面试通知","menuJump":"列表","tableName":"mianshitongzhi"}],"menu":"面试通知管理"},{"child":[{"appFrontIcon":"cuIcon-list","buttons":["查看"],"menu":"参加面试","menuJump":"列表","tableName":"canjiamianshi"}],"menu":"参加面试管理"},{"child":[{"appFrontIcon":"cuIcon-skin","buttons":["查看"],"menu":"面试成绩","menuJump":"列表","tableName":"mianshichengji"}],"menu":"面试成绩管理"},{"child":[{"appFrontIcon":"cuIcon-explore","buttons":["查看"],"menu":"综合成绩","menuJump":"列表","tableName":"zonghechengji"}],"menu":"综合成绩管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-keyboard","buttons":["查看"],"menu":"报名指南列表","menuJump":"列表","tableName":"baomingzhinan"}],"menu":"报名指南模块"},{"child":[{"appFrontIcon":"cuIcon-phone","buttons":["查看","考生报名"],"menu":"报名入口列表","menuJump":"列表","tableName":"baomingrukou"}],"menu":"报名入口模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"考生","tableName":"kaosheng"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
