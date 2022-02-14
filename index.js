var http=require("http");
var hostname='127.0.0.1';
var port=3000;
var app=http.createServer(function(req,res)
        {
           res.setHeader=('content-type','application/json');
           res.end(JSON.stringify(
             {
               firstname:"Nabil",
               LastName:"Al-Saidi"
             })
             );
         });
  app.listen(port,hostname);
