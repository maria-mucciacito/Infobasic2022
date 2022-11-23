import React from 'react';
import {useRef,useState,useEffect} from "react";

const Login = () => {
    const userRef = useRef();
    const errRef = useRef();

    const [user,setUser] = useState('');
    const [pwd,setPwd] = useState('');
    const [errMsg,setErrMsg] = useState('');
    const [success,setSuccess] = useState(false);

    useEffect(()=>{
        userRef.current.focus();

    }, [])

    useEffect(()=>{
        setErrMsg('');
    }, [user,pwd])

    const handleSubmit = async (e) =>{
        e.preventDefault();
        setSuccess(true)

    }

    return (
        <>
        {success ? (
            <section>
                <h1>You are logged</h1>
            </section>
        ): (
        <section>

            <p ref={errRef}>{errMsg}</p>
            <h1>Sign in</h1>
            <form action='' onSubmit={handleSubmit}>
                <label>User: </label>
                <input type="text" id="user" autoComplete='off' ref={userRef} onChange={(e)=> setUser(e.target.value)} value={user} required></input>
                <label>Password: </label>
                <input type="password" id="password" autoComplete='off' onChange={(e)=> setPwd(e.target.value)} value={pwd} required></input>
                <button>sIGN IN </button>
            
            </form>

        </section>
        )}
        </>
    )
}

export default Login
