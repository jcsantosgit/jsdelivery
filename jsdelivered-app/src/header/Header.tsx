import React from 'react';

import './style.css'
import logo from '../images/logo.png';
import { Link } from 'react-router-dom';

export default function Header(){
    return (
            <nav className="navbar navbar-expand-sm bg-color-nav">
                <Link to="/" className="navbar-brand">
                    <img src={logo} style={{'width':'250px','height':'69px'}} alt="logo JS Delivery" />
                </Link>
            </nav>
    )
}