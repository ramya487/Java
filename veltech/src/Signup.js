import React from 'react'
import email_icon from'./assets/email.png'
import user_icon from'./assets/person.png'
import password_icon from './assets/password.png'
import phone_icon from './assets/phone.png'
import './Signup.css'

const Signup = () => {
  return (
    <div className='container'>
        <div className="header">
            <div className="title">Sign Up</div>
            <div className="line"></div>
        </div>
        <div className="inputs">
            <div className="input">
                <img src={user_icon} alt='user_icon'/>
                <input type="text" placeholder="Name"/>
            </div>
            <div className="input">
                <img src={phone_icon} alt='user_icon'/>
                <input type="text" placeholder="Mobile Number"/>
            </div>
            <div className="input">
                <img src={email_icon} alt='email_icon'/>
                <input type="email" placeholder="Email"/>
            </div>
            <div className="input">
                <img src={password_icon} alt='password_icon'/>
                <input type="password" placeholder="Password"/>
            </div>
        </div>
        {/* <div className="forgetPassword">Forgot password ? <span>Click Here</span></div> */}
            <div className="submit_container">
                <div className="singup">Sign Up</div>
                <div className="login">Login</div>
            </div>
    </div>
  )
}

export default Signup
