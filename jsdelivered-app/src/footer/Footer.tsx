import React from 'react';

import './styles.css';
import { ReactComponent as InstagramIcon } from './instagram.svg';
import { ReactComponent as LinkinIcon } from './linkedin.svg';
import { ReactComponent as YoutubeIcon } from './youtube.svg';

export default function Footer(){
    return(
        <footer className="main-footer">
            Desenvolvido por João Santos
            <div className="footer-icons">
            <a href="#" target="_new" >
                <InstagramIcon />
            </a>
            <a href="#" target="_new" >
                <YoutubeIcon />
            </a>
            <a href="#" target="_new" >
                <LinkinIcon />
            </a>            
            </div>
        </footer>
    )
}