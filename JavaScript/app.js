//导入koa,和koa 1.x不同，在koa2中，我们导入的是一个class,因此用大写的Koa表示
const Koa = require('koa');

//创建一个Koa对象表示web app 本身：
const app = new Koa();

//对于任何请求，app将调用该异步函数处理请求：
app.use(async(ctx,next)=>{
    await.next();
    ctx.response.type='text/html';
    ctx.reponse.body='<h1/>Hell0, koa2!</h2>';
});

//在端口300监听
app.listen(3000);
console.log('app started at port 3000...');

//对于每一个http请求，Koa将调用我们传入的异步函数来处理
async(ctx,next)=>{
    await next();
    //设置response的Content-Type:
    ctx.response.type = 'text/html';
    //设置response的内容
    ctx.response.body = '<h1>Hello, koa2!</h1>'
}