import React from 'react';

import './style.css'
import logo from '../images/logo.png';

export default function Header(){
    return (
            <nav className="navbar navbar-expand-sm bg-color-nav">
                <a className="navbar-brand" href="#">
                    <img src={logo} style={{'width':'250px','height':'69px'}} />
                </a>
            </nav>
    )
}