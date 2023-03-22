function Demo()
    { 
        count=0;
       a=document.getElementById('na').value;
       b=document.getElementById('cn').value;
       c=document.getElementById('gm').value;
       d=document.getElementById('un').value;
       e=document.getElementById('up').value;
       
       var re1=/^\w{5,20}$/;
       var re2=/^\d{10}$/;
       var re3=/^\w{3,20}\@[g][m][a][i][l]\.\w{3}$/;
       var re4=/^\w{5,20}$/;
       var re5=/^\w{8,20}$/;
       
       
       if(re1.test(a)===false)
       {
           alert("INVALID NAME");
           count++;
           
       }
         if(re2.test(b)===false)
       {
           alert("INVALID NUMBER");
           count++;
           
       }
         if(re3.test(c)===false)
       {
           alert("INVALID mail");
           count++;
           
       }
      
          if(re4.test(d)===false)
       {
           alert("INVALID USERNAME");
           count++;
           
       }
       if(re5.test(e)===false)
       {
           alert("INVALID PASSWORD");
           count++;
          
       }
       if(count==0)
       {
          form1.submit(); 
       }
      

    }