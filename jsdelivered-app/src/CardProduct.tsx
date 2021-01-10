import React from 'react';

import ProductImage from './images/products/coca-batata-hamburguer.jpeg';

function CardProduct(){
    return (
        <div className="col-3">
            <div className="card">
                <h2 className="title">Combo 1</h2>
                <img src={ProductImage} alt="Combo 1" style={{'width':'100%'}} />
                <p className="price">R$19.99</p>
                <h6 className="description-title">Descrição</h6>
                <p className="content">
                Coca Lata + Porção de Batatas + X-Hamburguer
                </p>
                <p><button>Quero Este</button></p>
            </div>        
        </div>
    )
}

export default CardProduct;