import React from 'react'
import {Link} from "react-router-dom"

const Header = (props) => {
  return (
    <header>
        <h1>Navbar</h1>
        <ul>
            <li>Navbar</li>
            <li> Home </li>
            <li><Link to="/contact">Contact</Link></li>
        </ul>   
    </header>
  )
}

export default Header