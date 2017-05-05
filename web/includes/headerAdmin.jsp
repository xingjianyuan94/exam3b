<div class="header"> <!--header div -->
		<div class="headerImg"> <!--header img div -->
		<img src="includes/animalLogo.jpg" height = "150px" />
		</div> <!--close header div -->
		
		<div class="headerText"> <!--header text div -->
		<h1>Customer Management  App</h1>
		</div> <!--close header div -->
                
                <div class="headerLogin">
                    <form name="login">
                      
            <br><br>
            <p>User:123</p>
            <input type="button" onclick="check1(this.form)" value="Logout" class = "button"/>
        </form>
                    
        <script language="javascript">
            function check(form) { 
                
                if(form.userid.value === "123" && form.pswrd.value === "123") {
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