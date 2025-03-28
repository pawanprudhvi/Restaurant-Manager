import React, {useState} from "react"
import './login.css'

function Login() 
{
    const  [message,setMessage] = useState("");
    const  [username,setUsername]=useState("");
    const [password,setPassword]=useState("");
    const handlelogin = async()=>
    {
        try{
             const response = await fetch("http://localhost:8081/login",
             {
                 method:"POST",
             headers:{
                 "Content-Type":"application/json"

             },
             body:JSON.stringify({username,password}),
            });
            const result = await response.text();
    if(response.ok)
    {
        setMessage(result);
    }
    else{
        setMessage("Login Unsuccessful");
    }
}
catch(error)
{
    console.log(error);
    setMessage("Login Failed");
}
    };
return (
    <div className="container">
        <div className="inputs">
        <div className="header">
            <div className="Logintext"><h2>Login/SignUp</h2></div>
            </div>.
    <input type="text" name="username"
    value = {username}
    onChange={(e)=>setUsername(e.target.value)}/><br/>
    <input type="text" name="password" 
    value = {password} onChange = {(e)=>setPassword(e.target.value)} /><br/>
    <button onClick={handlelogin}>Login</button>
    {message && <h1>{message}</h1>}  
    </div> 
    </div>
)
}
export default Login;