import React from 'react';

import ProductImage from './images/products/coca-batata-hamburguer.jpeg';
import { Product } from './types';

type Props = {
    product: Product;
}

function formatPrice(price: number){
    const formatter = new Intl.NumberFormat('pt-BR', {
        style: 'currency',
        currency: 'BRL',
        minimumFractionDigits: 2
    });
    return formatter.format(price);
}


function CardProduct({product} : Props){
    return (
        <div className="col-3">
            <div className="card">
                <h2 className="title">{product.name}</h2>
                <img src={product.imageUrl} alt={product.name} style={{'width':'100%'}} />
                <p className="price">{formatPrice(product.price)}</p>
                <h6 className="description-title">Descrição</h6>
                <p className="content">
                    {product.description}
                </p>
            </div>        
        </div>
    )
}

export default CardProduct;