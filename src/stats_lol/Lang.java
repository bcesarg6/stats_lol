package stats_lol;

import static stats_lol.Stats_lol.lang;

/**
 *
 * @author root
 */
public class Lang {
    public static String selectOption = lng("selectOption");
    public static String seeStats = lng("seeStats");
    /*public static String selecOption = lng("selecOption");
    public static String selecOption = lng("selecOption");
    public static String selecOption = lng("selecOption");
    public static String selecOption = lng("selecOption");
    public static String selecOption = lng("selecOption");
    public static String selecOption = lng("selecOption");
    public static String selecOption = lng("selecOption");
    public static String selecOption = lng("selecOption");
    public static String selecOption = lng("selecOption");
    public static String selecOption = lng("selecOption");
    public static String selecOption = lng("selecOption");
    public static String selecOption = lng("selecOption");
    public static String selecOption = lng("selecOption");
    public static String selecOption = lng("selecOption");
    public static String selecOption = lng("selecOption");
    public static String selecOption = lng("selecOption");
    public static String selecOption = lng("selecOption");
    public static String selecOption = lng("selecOption");
    public static String selecOption = lng("selecOption");
    public static String selecOption = lng("selecOption");
    public static String selecOption = lng("selecOption");
    public static String selecOption = lng("selecOption");
    public static String selecOption = lng("selecOption");
    public static String selecOption = lng("selecOption");
    public static String selecOption = lng("selecOption");
    public static String selecOption = lng("selecOption");
    public static String selecOption = lng("selecOption");
    public static String selecOption = lng("selecOption");
    public static String selecOption = lng("selecOption");
    public static String selecOption = lng("selecOption");
    public static String selecOption = lng("selecOption");
    public static String selecOption = lng("selecOption");
    public static String selecOption = lng("selecOption");
    public static String selecOption = lng("selecOption");
    public static String selecOption = lng("selecOption");
    public static String selecOption = lng("selecOption");
    public static String selecOption = lng("selecOption");
    public static String selecOption = lng("selecOption");
    public static String selecOption = lng("selecOption");
    public static String selecOption = lng("selecOption");
    public static String selecOption = lng("selecOption");
    public static String selecOption = lng("selecOption");
    public static String selecOption = lng("selecOption");
    public static String selecOption = lng("selecOption");
    public static String selecOption = lng("selecOption");
    public static String selecOption = lng("selecOption");
    public static String selecOption = lng("selecOption");
    public static String selecOption = lng("selecOption");
    public static String selecOption = lng("selecOption");
    public static String selecOption = lng("selecOption");
    public static String selecOption = lng("selecOption");
    public static String selecOption = lng("selecOption");
    public static String selecOption = lng("selecOption");
    public static String selecOption = lng("selecOption");
    public static String selecOption = lng("selecOption");
    public static String selecOption = lng("selecOption");
    public static String selecOption = lng("selecOption");
    public static String selecOption = lng("selecOption");
    public static String selecOption = lng("selecOption");
    public static String selecOption = lng("selecOption");
    public static String selecOption = lng("selecOption");
    public static String selecOption = lng("selecOption");
    public static String selecOption = lng("selecOption");
    public static String selecOption = lng("selecOption");
    public static String selecOption = lng("selecOption");
    public static String selecOption = lng("selecOption");
    public static String selecOption = lng("selecOption");
    public static String selecOption = lng("selecOption");
    public static String selecOption = lng("selecOption");
    public static String selecOption = lng("selecOption");
    public static String selecOption = lng("selecOption");
    public static String selecOption = lng("selecOption");
    public static String selecOption = lng("selecOption");
    public static String selecOption = lng("selecOption");
    public static String selecOption = lng("selecOption");
    public static String selecOption = lng("selecOption");
    public static String selecOption = lng("selecOption");
    public static String selecOption = lng("selecOption");
    public static String selecOption = lng("selecOption");
    public static String selecOption = lng("selecOption");
    public static String selecOption = lng("selecOption");
    public static String selecOption = lng("selecOption");
    public static String selecOption = lng("selecOption");
    public static String selecOption = lng("selecOption");
    public static String selecOption = lng("selecOption");
    public static String selecOption = lng("selecOption");
    public static String selecOption = lng("selecOption");
    public static String selecOption = lng("selecOption");*/
    static String lng(String l){
        String s = null;
        switch(lang){
            case "pt-BR":
                switch(l){
                    case "selectOption":
                        s = "Selecione sua opção";
                        break;
                    case "seeStats":
                        s = "Estatísticas";
                        break;
                    case "newMatch":
                        s = "Novo jogo";
                        break;
                    case "clearData":
                        s = "Limpar dados";
                        break;
                    case "toolTipStats":
                        s = "Abre uma interface com as opções de estatísticas";
                        break;
                    case "toolTipMatch":
                        s = "Inicia a inserção de um novo jogo";
                        break;
                    case "toolTipClear":
                        s = "Limpa todos os dados criados até agora";
                        break;
                    case "plyStats":
                        s = "Estatísticas dos jogadores";
                        break;
                    case "teamStats": 
                        s = "Estatísticas dos times";
                        break;
                    case "chStats":
                        s = "Estatísticas dos campeões";
                        break;
                    case "scoreTable":
                        s = "Tabela de pontos";
                        break;
                    case "toolTipPlyTb":
                        s = "Abre uma tabela com as estatísticas dos jogadores";
                        break;
                    case "toolTipTeamTb":
                        s = "Abre uma tabela com as estatísticas dos times";
                        break;
                    case "toolTipChTb":
                        s = "Abre uma tabela com as estatísticas dos campeões";
                        break;
                    case "toolTipScoreTb":
                        s = "Abre a tabela de pontos";
                        break;
                    case "player":
                        s = "Jogador";
                        break;
                    case "kda":
                        s = "AMA";
                        break;
                    case "avgFarm":
                        s = "Farm médio";
                        break;
                    case "minFarm":
                        s = "Minions por minuto";
                        break;
                    case "avgGold":
                        s = "Ouro por partida";
                        break;
                    case "minGold":
                        s = "Ouro por minuto";
                        break;
                    case "killPar":
                        s = "Participação nos abates";
                        break;
                    case "toolTipPlayer":
                        s = "Nome do jogador";
                        break;
                    case "toolTipKDA":
                        s = "(Abates + assistências)/Mortes";
                        break;
                    case "toolTipAvgFarm":
                        s = "Farm total/jogos totais";
                        break;
                    case "tooltipMinFarm":
                        s = "Farm total/tempo total de jogo";
                        break;
                    case "toolTipAvgGold":
                        s = "Ouro total/jogos totais";
                        break;
                    case "toolTipMinGold":
                        s = "Ouro total/tempo total de jogo";
                        break;
                    case "toolTipKillPar":
                        s = "Abates totais do time/(Abates + assistências do jogador)";
                        break;
                    case "team":
                        s = "Time";
                        break;
                    case "avgTurrets":
                        s = "Torres destruídas por jogo";
                        break;
                    case "avgDrag":
                        s = "Dragões abatidos por jogo";
                        break;
                    case "avgBarons":
                        s = "Barões abatidos por jogo";
                        break;
                    case "avgTime":
                        s = "Tempo médio de jogo";
                        break;
                    case "winRatio":
                        s = "Porcentagem de jogos ganhos";
                        break;
                    case "toolTipTm":
                        s = "Nome do time";
                        break;
                    case "toolTipAvgTurrets":
                        s = "Torres totais/jogos totais";
                        break;
                    case "toolTipAvgDrag":
                        s = "Dragões abatidos/jogos totais";
                        break;
                    case "toolTipAvgBarons":
                        s = "Barões abatidos/jogos totais";
                        break;
                    case "toolTipAvgTime":
                        s = "Tempo total de jogo/jogos totais";
                        break;
                    case "toolTipWinRatio":
                        s = "Total de vitórias/jogos totais";
                        break;
                    case "champion":
                        s = "Campeão";
                        break;
                    case "pick":
                        s = "Selecionado";
                        break;
                    case "ban":
                        s = "Banido";
                        break;
                    case "win":
                        s = "Ganhou";
                        break;
                    case "toolTipChampion":
                        s = "Nome do campeão";
                        break;
                    case "toolTipPick":
                        s = "Porcentagem de vezes selecionado";
                        break;
                    case "toolTipBan":
                        s = "Porcentagem de vezes banido";
                        break;
                    case "toolTipWR":
                        s = "Porcentagem de vitórias";
                        break;
                    case "points":
                        s = "Pontos";
                        break;
                    case "games":
                        s = "Jogos";
                        break;
                    case "wins":
                        s = "Vitórias";
                        break;
                    case "ties":
                        s = "Empates";
                        break;
                    case "loses":
                        s = "Derrotas";
                        break;
                    case "totalWins":
                        s = "Vitórias totais";
                        break;
                    case "totalLoses":
                        s = "Derrotas totais";
                        break;
                    case "%":
                        s = "%";
                        break;
                    case "toolTipPoints":
                        s = "V = 3, E = 1, D = 0";
                        break;
                    case "toolTipGames":
                        s = "Vitórias MD2";
                        break;
                    case "toolTipTie":
                        s = "Empates MD2";
                        break;
                    case "toolTipLoses":
                        s = "Derrotas MD2";
                        break;
                    case "toolTipSingleG":
                        s = "Jogos ganhos";
                        break;
                    case "toolTipSingleL":
                        s = "Jogos perdidos";
                        break;
                    case "toolTip%":
                        s = "Pontos ganhos/pontos disputados";
                        break;
                    case "blueSide":
                        s = "Lado azul";
                        break;
                    case "redSide":
                        s = "Lado vermelho";
                        break;
                    case "next":
                        s = "Próximo";
                        break;
                    case "txtError":
                        s = "Times iguais, selecione times diferentes.";
                        break;
                    case "error":
                        s = "Erro";
                        break;
                    case "chBanned":
                        s = "  Campeões banidos  ";
                        break;
                    case "winner":
                        s = "Lado ganahdor";
                        break;
                    case "mtTime":
                        s = "Tempo de jogo";
                        break;
                    case "toolTipChBanned":
                        s = "Campeão banido no jogo ";
                        break;
                    case "toolTipWinner":
                        s = "Selecione se o time ";
                        break;
                    case "toolTipMtTime":
                        s = "Tempo de jogo";
                        break;
                    case "turrets":
                        s = "Torres:";
                        break;
                    case "dragons":
                        s = "Dragões:";
                        break;
                    case "barons":
                        s = "Barões:";
                        break;
                    case "kills":
                        s = "Abates";
                        break;
                    case "assists":
                        s = "Assistências";
                        break;
                    case "deaths":
                        s = "Mortes";
                        break;
                    case "creeps":
                        s = "Minions";
                        break;
                    case "gold":
                        s = "Ouro";
                        break;
                    case "toolTipCh":
                        s = "Campeão escolhido por ";
                        break;
                    case "toolTipKill":
                        s = "Quantidade de abates de ";
                        break;
                    case "toolTipAssists":
                        s = "Quantidade de assistências de ";
                        break;
                    case "toolTipCreeps":
                        s = "Quantidade de tropas abatidas por ";
                        break;
                    case "toolTipGold":
                        s = "Ouro total de ";
                        break;
                    case "toolTipTurret":
                        s = "Torres destruidas pelo time ";
                        break;
                    case "toolTipDrag":
                        s = "Dragões abatidos pelo time ";
                        break;
                    case "toolTipBaron":
                        s = "Barões abatidos pelo time ";
                        break;
                    case "matchSuccess":
                        s = "Jogo adicionado com sucesso";
                        break;
                    case "finish":
                        s = "Terminar";
                        break;
                }
                break;
            case "en-US":
                break;
            default:
                break;
        }
    return s;
    }   
}
