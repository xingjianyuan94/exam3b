<div class="header"> <!--header div -->
		<div class="headerImg"> <!--header img div -->
		<img src="includes/Logo.jpg" height = "150px" />
		</div> <!--close header div -->
		
		<div class="headerText"> <!--header text div -->
		<h2>Customers Management App</h2>
		</div> <!--close header div -->
                
                <div class="headerLogin">
                    <form name="login">
                        Username:<input type="text" name="userid" class = "username"/><br>
            Password: <input type="password" name="pswrd" class = "username"/>
            <br><br>
            <input type="button"  onclick="check(this.form)" value="Admin Login" class = "button"/>
            <input type="reset"  value="Clear" class = "button"/>
            <input type="button" onclick="check1(this.form)" value="Logout" class = "button"/>
            <br>
            <p>(Username=123;Password=123)</p>
        </form>
                    
        <script language="javascript">
            function check(form) { 
                
                if(form.userid.value === "123" && form.pswrd.value === "123") {
                    window.close();
                    window.open('indexAdmin.jsp');
                }
                else {
                    alert("Error Password or Username");
                }
            }
            
            function check1(form) { 
                window.close();
                 window.open('index.jsp');
            }
        </script>
                </div>
        
		
		<br clear="all">
	</div> <!--close header div -->