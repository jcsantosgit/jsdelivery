function OrderHeader(){
    return(
        <div className="container-fluid">
            <div className="row bg-order-header">
                <div className="col">
                    <h4 className="order-header-title">Agora escolha seus produtos</h4>
                </div>
                <div className="col">
                    <button className="btn-search-header">Pesquisar</button>
                    <input type="text" name="search" placeholder="Não acho? Digite aqui.." className="search-order "></input>
                </div>
            </div>
        </div>
    )
}

export default OrderHeader;