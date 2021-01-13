import React from 'react';

import ImageHome from '../images/home.png';
import Footer from '../footer/Footer';

import './style.css';
import { Link } from 'react-router-dom';

export default function Home(){
    return (
        <>
        <div className="container-fluid bg-home">
            <div className="row">
                <div className="col">
                    <h1>
                        Faça seu pedido que nós entregamos para você
                    </h1>
                    <h3>
                        Escollha seu produto e em poucos mínutos levaremos na sua porta
                    </h3>
                    <div className="btn-action-container">
                        <Link to="/orders" className="btn-action" >
                            <span>Fazer Pedido</span>
                        </Link>
                    </div>
                    
                </div>
                <div className="col">
                    <img src={ImageHome} className="image-home" alt="Imagem da Home" />
                </div>                
            </div>
        </div>
        <Footer />
        </>
    )
}