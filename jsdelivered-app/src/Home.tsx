import ImageHome from './images/home.png';
import './Home.css';

export default function Home(){
    return (
        <div className="container-fluid">
            <div className="row">
                <div className="col">
                    <h1>
                        Faça seu pedido que nós entregamos para você
                    </h1>
                    <h3>
                        Escollha seu pedido e em poucos mínutos levaremos na sua porta
                    </h3>
                    <div className="btn-action-container">
                        <a href="#" className="btn-action" >
                            <span>Fazer Pedido</span>
                        </a>
                    </div>
                    
                </div>
                <div className="col">
                    <img src={ImageHome} className="image-home" />
                </div>                
            </div>
        </div>
    )
}