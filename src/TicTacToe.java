import java.util.Scanner;

public class TicTacToe {
    private static void play() {
        char[] board = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
        printBoard(board);
        while (true) {
            char currentPlayer = 'X';
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter Position: ");
            try {
                int position = scanner.nextInt();
                while ((position < 1 || position > 9) || board[position - 1] != ' ') {
                    System.out.print("Invalid input, try again: ");
                    position = scanner.nextInt();
                }
                board[position - 1] = currentPlayer;
                if (checkWin(board)) {
                    printBoard(board);
                    System.out.println(currentPlayer + " Wins!");
                    break;
                }
                else if (checkTie(board)) {
                    printBoard(board);
                    System.out.println("Tie!");
                    break;
                }
                else {
                    currentPlayer = changePlayer(currentPlayer);
                }
                if ((board[0] == board[1]) && board[0] == currentPlayer) {
                    if (board[2] == ' ') {
                        board[2] = currentPlayer;
                        printBoard(board);
                        if (checkWin(board)) {
                            System.out.println(currentPlayer + " Wins!");
                            break;
                        }
                        else if (checkTie(board)) {
                            System.out.println("Tie!");
                            break;
                        }
                        else {
                            continue;
                        }
                    }
                }
                if ((board[0] == board[2]) && board[0] == currentPlayer) {
                    if (board[1] == ' ') {
                        board[1] = currentPlayer;
                        printBoard(board);
                        if (checkWin(board)) {
                            System.out.println(currentPlayer + " Wins!");
                            break;
                        }
                        else if (checkTie(board)) {
                            System.out.println("Tie!");
                            break;
                        }
                        else {
                            continue;
                        }
                    }
                }
                if ((board[0] == board[4]) && board[0] == currentPlayer) {
                    if (board[8] == ' ') {
                        board[8] = currentPlayer;
                        printBoard(board);
                        if (checkWin(board)) {
                            System.out.println(currentPlayer + " Wins!");
                            break;
                        }
                        else if (checkTie(board)) {
                            System.out.println("Tie!");
                            break;
                        }
                        else {
                            continue;
                        }
                    }
                }
                if ((board[0] == board[8]) && board[0] == currentPlayer) {
                    if (board[4] == ' ') {
                        board[4] = currentPlayer;
                        printBoard(board);
                        if (checkWin(board)) {
                            System.out.println(currentPlayer + " Wins!");
                            break;
                        }
                        else if (checkTie(board)) {
                            System.out.println("Tie!");
                            break;
                        }
                        else {
                            continue;
                        }
                    }
                }
                if ((board[0] == board[3]) && board[0] == currentPlayer) {
                    if (board[6] == ' ') {
                        board[6] = currentPlayer;
                        printBoard(board);
                        if (checkWin(board)) {
                            System.out.println(currentPlayer + " Wins!");
                            break;
                        }
                        else if (checkTie(board)) {
                            System.out.println("Tie!");
                            break;
                        }
                        else {
                            continue;
                        }
                    }
                }
                if ((board[0] == board[6]) && board[0] == currentPlayer) {
                    if (board[3] == ' ') {
                        board[3] = currentPlayer;
                        printBoard(board);
                        if (checkWin(board)) {
                            System.out.println(currentPlayer + " Wins!");
                            break;
                        }
                        else if (checkTie(board)) {
                            System.out.println("Tie!");
                            break;
                        }
                        else {
                            continue;
                        }
                    }
                }
                if ((board[1] == board[2]) && board[1] == currentPlayer) {
                    if (board[0] == ' ') {
                        board[0] = currentPlayer;
                        printBoard(board);
                        if (checkWin(board)) {
                            System.out.println(currentPlayer + " Wins!");
                            break;
                        }
                        else if (checkTie(board)) {
                            System.out.println("Tie!");
                            break;
                        }
                        else {
                            continue;
                        }
                    }
                }
                if ((board[1] == board[4]) && board[1] == currentPlayer) {
                    if (board[7] == ' ') {
                        board[7] = currentPlayer;
                        printBoard(board);
                        if (checkWin(board)) {
                            System.out.println(currentPlayer + " Wins!");
                            break;
                        }
                        else if (checkTie(board)) {
                            System.out.println("Tie!");
                            break;
                        }
                        else {
                            continue;
                        }
                    }
                }
                if ((board[1] == board[7]) && board[1] == currentPlayer) {
                    if (board[4] == ' ') {
                        board[4] = currentPlayer;
                        printBoard(board);
                        if (checkWin(board)) {
                            System.out.println(currentPlayer + " Wins!");
                            break;
                        }
                        else if (checkTie(board)) {
                            System.out.println("Tie!");
                            break;
                        }
                        else {
                            continue;
                        }
                    }
                }
                if ((board[2] == board[4]) && board[2] == currentPlayer) {
                    if (board[6] == ' ') {
                        board[6] = currentPlayer;
                        printBoard(board);
                        if (checkWin(board)) {
                            System.out.println(currentPlayer + " Wins!");
                            break;
                        }
                        else if (checkTie(board)) {
                            System.out.println("Tie!");
                            break;
                        }
                        else {
                            continue;
                        }
                    }
                }
                if ((board[2] == board[6]) && board[2] == currentPlayer) {
                    if (board[4] == ' ') {
                        board[4] = currentPlayer;
                        printBoard(board);
                        if (checkWin(board)) {
                            System.out.println(currentPlayer + " Wins!");
                            break;
                        }
                        else if (checkTie(board)) {
                            System.out.println("Tie!");
                            break;
                        }
                        else {
                            continue;
                        }
                    }
                }
                if ((board[2] == board[5]) && board[2] == currentPlayer) {
                    if (board[8] == ' ') {
                        board[8] = currentPlayer;
                        printBoard(board);
                        if (checkWin(board)) {
                            System.out.println(currentPlayer + " Wins!");
                            break;
                        }
                        else if (checkTie(board)) {
                            System.out.println("Tie!");
                            break;
                        }
                        else {
                            continue;
                        }
                    }
                }
                if ((board[2] == board[8]) && board[2] == currentPlayer) {
                    if (board[5] == ' ') {
                        board[5] = currentPlayer;
                        printBoard(board);
                        if (checkWin(board)) {
                            System.out.println(currentPlayer + " Wins!");
                            break;
                        }
                        else if (checkTie(board)) {
                            System.out.println("Tie!");
                            break;
                        }
                        else {
                            continue;
                        }
                    }
                }
                if ((board[3] == board[4]) && board[3] == currentPlayer) {
                    if (board[5] == ' ') {
                        board[5] = currentPlayer;
                        printBoard(board);
                        if (checkWin(board)) {
                            System.out.println(currentPlayer + " Wins!");
                            break;
                        }
                        else if (checkTie(board)) {
                            System.out.println("Tie!");
                            break;
                        }
                        else {
                            continue;
                        }
                    }
                }
                if ((board[3] == board[5]) && board[3] == currentPlayer) {
                    if (board[4] == ' ') {
                        board[4] = currentPlayer;
                        printBoard(board);
                        if (checkWin(board)) {
                            System.out.println(currentPlayer + " Wins!");
                            break;
                        }
                        else if (checkTie(board)) {
                            System.out.println("Tie!");
                            break;
                        }
                        else {
                            continue;
                        }
                    }
                }
                if ((board[3] == board[6]) && board[3] == currentPlayer) {
                    if (board[0] == ' ') {
                        board[4] = currentPlayer;
                        printBoard(board);
                        if (checkWin(board)) {
                            System.out.println(currentPlayer + " Wins!");
                            break;
                        }
                        else if (checkTie(board)) {
                            System.out.println("Tie!");
                            break;
                        }
                        else {
                            continue;
                        }
                    }
                }
                if ((board[4] == board[8]) && board[4] == currentPlayer) {
                    if (board[0] == ' ') {
                        board[0] = currentPlayer;
                        printBoard(board);
                        if (checkWin(board)) {
                            System.out.println(currentPlayer + " Wins!");
                            break;
                        }
                        else if (checkTie(board)) {
                            System.out.println("Tie!");
                            break;
                        }
                        else {
                            continue;
                        }
                    }
                }
                if ((board[4] == board[7]) && board[4] == currentPlayer) {
                    if (board[1] == ' ') {
                        board[1] = currentPlayer;
                        printBoard(board);
                        if (checkWin(board)) {
                            System.out.println(currentPlayer + " Wins!");
                            break;
                        }
                        else if (checkTie(board)) {
                            System.out.println("Tie!");
                            break;
                        }
                        else {
                            continue;
                        }
                    }
                }
                if ((board[4] == board[6]) && board[4] == currentPlayer) {
                    if (board[2] == ' ') {
                        board[2] = currentPlayer;
                        printBoard(board);
                        if (checkWin(board)) {
                            System.out.println(currentPlayer + " Wins!");
                            break;
                        }
                        else if (checkTie(board)) {
                            System.out.println("Tie!");
                            break;
                        }
                        else {
                            continue;
                        }
                    }
                }
                if ((board[4] == board[5]) && board[4] == currentPlayer) {
                    if (board[3] == ' ') {
                        board[3] = currentPlayer;
                        printBoard(board);
                        if (checkWin(board)) {
                            System.out.println(currentPlayer + " Wins!");
                            break;
                        }
                        else if (checkTie(board)) {
                            System.out.println("Tie!");
                            break;
                        }
                        else {
                            continue;
                        }
                    }
                }
                if ((board[5] == board[8]) && board[5] == currentPlayer) {
                    if (board[2] == ' ') {
                        board[2] = currentPlayer;
                        printBoard(board);
                        if (checkWin(board)) {
                            System.out.println(currentPlayer + " Wins!");
                            break;
                        }
                        else if (checkTie(board)) {
                            System.out.println("Tie!");
                            break;
                        }
                        else {
                            continue;
                        }
                    }
                }
                if ((board[6] == board[7]) && board[6] == currentPlayer) {
                    if (board[8] == ' ') {
                        board[8] = currentPlayer;
                        printBoard(board);
                        if (checkWin(board)) {
                            System.out.println(currentPlayer + " Wins!");
                            break;
                        }
                        else if (checkTie(board)) {
                            System.out.println("Tie!");
                            break;
                        }
                        else {
                            continue;
                        }
                    }
                }
                if ((board[6] == board[8]) && board[6] == currentPlayer) {
                    if (board[7] == ' ') {
                        board[7] = currentPlayer;
                        printBoard(board);
                        if (checkWin(board)) {
                            System.out.println(currentPlayer + " Wins!");
                            break;
                        }
                        else if (checkTie(board)) {
                            System.out.println("Tie!");
                            break;
                        }
                        else {
                            continue;
                        }
                    }
                }
                if ((board[7] == board[8]) && board[7] == currentPlayer) {
                    if (board[6] == ' ') {
                        board[6] = currentPlayer;
                        printBoard(board);
                        if (checkWin(board)) {
                            System.out.println(currentPlayer + " Wins!");
                            break;
                        }
                        else if (checkTie(board)) {
                            System.out.println("Tie!");
                            break;
                        }
                        else {
                            continue;
                        }
                    }
                }
                if(position == 1) {
                    if (board[4] == ' ') {
                        board[4] = currentPlayer;
                        printBoard(board);
                        if (checkWin(board)) {
                            System.out.println(currentPlayer + " Wins!");
                            break;
                        }
                        else if (checkTie(board)) {
                            System.out.println("Tie!");
                            break;
                        }
                    }
                    else {
                        if (board[4] == 'X') {
                            if (board[8] == ' ') {
                                board[8] = currentPlayer;
                                printBoard(board);
                                if (checkWin(board)) {
                                    System.out.println(currentPlayer + " Wins!");
                                    break;
                                } else if (checkTie(board)) {
                                    System.out.println("Tie!");
                                    break;
                                }
                                else {
                                    continue;
                                }
                            }
                        } if (board[1] == 'X') {
                            if (board[2] == ' ') {
                                board[2] = currentPlayer;
                                printBoard(board);
                                if (checkWin(board)) {
                                    System.out.println(currentPlayer + " Wins!");
                                    break;
                                }
                                else if (checkTie(board)) {
                                    System.out.println("Tie!");
                                    break;
                                }
                                else {
                                    continue;
                                }
                            }
                        } if (board[2] == 'X') {
                            if (board[1] == ' ') {
                                board[1] = currentPlayer;
                                printBoard(board);
                                if (checkWin(board)) {
                                    System.out.println(currentPlayer + " Wins!");
                                    break;
                                }
                                else if (checkTie(board)) {
                                    System.out.println("Tie!");
                                    break;
                                }
                                else {
                                    continue;
                                }
                            }
                        } if (board[3] == 'X') {
                            if (board[6] == ' ') {
                                board[6] = currentPlayer;
                                printBoard(board);
                                if (checkWin(board)) {
                                    System.out.println(currentPlayer + " Wins!");
                                    break;
                                }
                                else if (checkTie(board)) {
                                    System.out.println("Tie!");
                                    break;
                                }
                                else {
                                    continue;
                                }
                            }
                        } if (board[6] == 'X') {
                            if (board[3] == ' ') {
                                board[3] = currentPlayer;
                                printBoard(board);
                                if (checkWin(board)) {
                                    System.out.println(currentPlayer + " Wins!");
                                    break;
                                }
                                else if (checkTie(board)) {
                                    System.out.println("Tie!");
                                    break;
                                }
                            }
                        } else {
                            if (board[1] == ' ') {
                                board[1] = currentPlayer;
                                printBoard(board);
                                if (checkWin(board)) {
                                    System.out.println(currentPlayer + " Wins!");
                                    break;
                                }
                                else if (checkTie(board)) {
                                    System.out.println("Tie!");
                                    break;
                                }
                            } else if (board[3] == ' ') {
                                board[3] = currentPlayer;
                                printBoard(board);
                                if (checkWin(board)) {
                                    System.out.println(currentPlayer + " Wins!");
                                    break;
                                }
                                else if (checkTie(board)) {
                                    System.out.println("Tie!");
                                    break;
                                }
                            } else if (board[5] == ' ') {
                                board[5] = currentPlayer;
                                printBoard(board);
                                if (checkWin(board)) {
                                    System.out.println(currentPlayer + " Wins!");
                                    break;
                                }
                                else if (checkTie(board)) {
                                    System.out.println("Tie!");
                                    break;
                                }
                            }  else if (board[7] == ' ') {
                                board[7] = currentPlayer;
                                printBoard(board);
                                if (checkWin(board)) {
                                    System.out.println(currentPlayer + " Wins!");
                                    break;
                                }
                                else if (checkTie(board)) {
                                    System.out.println("Tie!");
                                    break;
                                }
                            }
                        }
                    }
                }
                else if(position == 3) {
                    if (board[4] == ' ') {
                        board[4] = currentPlayer;
                        printBoard(board);
                        if (checkWin(board)) {
                            System.out.println(currentPlayer + " Wins!");
                            break;
                        }
                        else if (checkTie(board)) {
                            System.out.println("Tie!");
                            break;
                        }
                    }
                    else {
                        if (board[4] == 'X') {
                            if (board[6] == ' ') {
                                board[6] = currentPlayer;
                                printBoard(board);
                                if (checkWin(board)) {
                                    System.out.println(currentPlayer + " Wins!");
                                    break;
                                } else if (checkTie(board)) {
                                    System.out.println("Tie!");
                                    break;
                                }
                                else {
                                    continue;
                                }
                            }
                        } if (board[0] == 'X') {
                            if (board[1] == ' ') {
                                board[1] = currentPlayer;
                                printBoard(board);
                                if (checkWin(board)) {
                                    System.out.println(currentPlayer + " Wins!");
                                    break;
                                }
                                else if (checkTie(board)) {
                                    System.out.println("Tie!");
                                    break;
                                }
                                else {
                                    continue;
                                }
                            }
                        } if (board[1] == 'X') {
                            if (board[0] == ' ') {
                                board[0] = currentPlayer;
                                printBoard(board);
                                if (checkWin(board)) {
                                    System.out.println(currentPlayer + " Wins!");
                                    break;
                                }
                                else if (checkTie(board)) {
                                    System.out.println("Tie!");
                                    break;
                                }
                                else {
                                    continue;
                                }
                            }
                        } if (board[5] == 'X') {
                            if (board[8] == ' ') {
                                board[8] = currentPlayer;
                                printBoard(board);
                                if (checkWin(board)) {
                                    System.out.println(currentPlayer + " Wins!");
                                    break;
                                }
                                else if (checkTie(board)) {
                                    System.out.println("Tie!");
                                    break;
                                }
                                else {
                                    continue;
                                }
                            }
                        } if (board[8] == 'X') {
                            if (board[5] == ' ') {
                                board[5] = currentPlayer;
                                printBoard(board);
                                if (checkWin(board)) {
                                    System.out.println(currentPlayer + " Wins!");
                                    break;
                                }
                                else if (checkTie(board)) {
                                    System.out.println("Tie!");
                                    break;
                                }
                            }
                        } else {
                            if (board[1] == ' ') {
                                board[1] = currentPlayer;
                                printBoard(board);
                                if (checkWin(board)) {
                                    System.out.println(currentPlayer + " Wins!");
                                    break;
                                }
                                else if (checkTie(board)) {
                                    System.out.println("Tie!");
                                    break;
                                }
                            } else if (board[3] == ' ') {
                                board[3] = currentPlayer;
                                printBoard(board);
                                if (checkWin(board)) {
                                    System.out.println(currentPlayer + " Wins!");
                                    break;
                                }
                                else if (checkTie(board)) {
                                    System.out.println("Tie!");
                                    break;
                                }
                            } else if (board[5] == ' ') {
                                board[5] = currentPlayer;
                                printBoard(board);
                                if (checkWin(board)) {
                                    System.out.println(currentPlayer + " Wins!");
                                    break;
                                }
                                else if (checkTie(board)) {
                                    System.out.println("Tie!");
                                    break;
                                }
                            }  else if (board[7] == ' ') {
                                board[7] = currentPlayer;
                                printBoard(board);
                                if (checkWin(board)) {
                                    System.out.println(currentPlayer + " Wins!");
                                    break;
                                }
                                else if (checkTie(board)) {
                                    System.out.println("Tie!");
                                    break;
                                }
                            }
                        }
                    }
                }
                else if(position == 7) {
                    if (board[4] == ' ') {
                        board[4] = currentPlayer;
                        printBoard(board);
                        if (checkWin(board)) {
                            System.out.println(currentPlayer + " Wins!");
                            break;
                        }
                        else if (checkTie(board)) {
                            System.out.println("Tie!");
                            break;
                        }
                        else {
                            continue;
                        }
                    }
                    if (board[4] == 'X') {
                        if (board[2] == ' ') {
                            board[2] = currentPlayer;
                            printBoard(board);
                            if (checkWin(board)) {
                                System.out.println(currentPlayer + " Wins!");
                                break;
                            } else if (checkTie(board)) {
                                System.out.println("Tie!");
                                break;
                            }
                            else {
                                continue;
                            }
                        }
                    } if (board[0] == 'X') {
                        if (board[3] == ' ') {
                            board[3] = currentPlayer;
                            printBoard(board);
                            if (checkWin(board)) {
                                System.out.println(currentPlayer + " Wins!");
                                break;
                            }
                            else if (checkTie(board)) {
                                System.out.println("Tie!");
                                break;
                            }
                            else {
                                continue;
                            }
                        }
                    } if (board[3] == 'X') {
                        if (board[0] == ' ') {
                            board[0] = currentPlayer;
                            printBoard(board);
                            if (checkWin(board)) {
                                System.out.println(currentPlayer + " Wins!");
                                break;
                            }
                            else if (checkTie(board)) {
                                System.out.println("Tie!");
                                break;
                            }
                            else {
                                continue;
                            }
                        }
                    } if (board[7] == 'X') {
                        if (board[8] == ' ') {
                            board[8] = currentPlayer;
                            printBoard(board);
                            if (checkWin(board)) {
                                System.out.println(currentPlayer + " Wins!");
                                break;
                            }
                            else if (checkTie(board)) {
                                System.out.println("Tie!");
                                break;
                            }
                            else {
                                continue;
                            }
                        }
                    } if (board[8] == 'X') {
                        if (board[7] == ' ') {
                            board[7] = currentPlayer;
                            printBoard(board);
                            if (checkWin(board)) {
                                System.out.println(currentPlayer + " Wins!");
                                break;
                            }
                            else if (checkTie(board)) {
                                System.out.println("Tie!");
                                break;
                            }
                        }
                    } else {
                        if (board[1] == ' ') {
                            board[1] = currentPlayer;
                            printBoard(board);
                            if (checkWin(board)) {
                                System.out.println(currentPlayer + " Wins!");
                                break;
                            }
                            else if (checkTie(board)) {
                                System.out.println("Tie!");
                                break;
                            }
                        } else if (board[3] == ' ') {
                            board[3] = currentPlayer;
                            printBoard(board);
                            if (checkWin(board)) {
                                System.out.println(currentPlayer + " Wins!");
                                break;
                            }
                            else if (checkTie(board)) {
                                System.out.println("Tie!");
                                break;
                            }
                        } else if (board[5] == ' ') {
                            board[5] = currentPlayer;
                            printBoard(board);
                            if (checkWin(board)) {
                                System.out.println(currentPlayer + " Wins!");
                                break;
                            }
                            else if (checkTie(board)) {
                                System.out.println("Tie!");
                                break;
                            }
                        }  else if (board[7] == ' ') {
                            board[7] = currentPlayer;
                            printBoard(board);
                            if (checkWin(board)) {
                                System.out.println(currentPlayer + " Wins!");
                                break;
                            }
                            else if (checkTie(board)) {
                                System.out.println("Tie!");
                                break;
                            }
                        }
                    }
                }
                else if(position == 9) {
                    if (board[4] == ' ') {
                        board[4] = currentPlayer;
                        printBoard(board);
                        if (checkWin(board)) {
                            System.out.println(currentPlayer + " Wins!");
                            break;
                        }
                        else if (checkTie(board)) {
                            System.out.println("Tie!");
                            break;
                        }
                    }
                    else {
                        if (board[4] == 'X') {
                            if (board[0] == ' ') {
                                board[0] = currentPlayer;
                                printBoard(board);
                                if (checkWin(board)) {
                                    System.out.println(currentPlayer + " Wins!");
                                    break;
                                }
                                else if (checkTie(board)) {
                                    System.out.println("Tie!");
                                    break;
                                }
                                else {
                                    continue;
                                }
                            }
                        } if (board[2] == 'X') {
                            if (board[5] == ' ') {
                                board[5] = currentPlayer;
                                printBoard(board);
                                if (checkWin(board)) {
                                    System.out.println(currentPlayer + " Wins!");
                                    break;
                                }
                                else if (checkTie(board)) {
                                    System.out.println("Tie!");
                                    break;
                                }
                                else {
                                    continue;
                                }
                            }
                        } if (board[5] == 'X') {
                            if (board[2] == ' ') {
                                board[2] = currentPlayer;
                                printBoard(board);
                                if (checkWin(board)) {
                                    System.out.println(currentPlayer + " Wins!");
                                    break;
                                }
                                else if (checkTie(board)) {
                                    System.out.println("Tie!");
                                    break;
                                }
                                else {
                                    continue;
                                }
                            }
                        } if (board[7] == 'X') {
                            if (board[6] == ' ') {
                                board[6] = currentPlayer;
                                printBoard(board);
                                if (checkWin(board)) {
                                    System.out.println(currentPlayer + " Wins!");
                                    break;
                                }
                                else if (checkTie(board)) {
                                    System.out.println("Tie!");
                                    break;
                                }
                                else {
                                    continue;
                                }
                            }
                        } if (board[6] == 'X') {
                            if (board[7] == ' ') {
                                board[7] = currentPlayer;
                                printBoard(board);
                                if (checkWin(board)) {
                                    System.out.println(currentPlayer + " Wins!");
                                    break;
                                }
                                else if (checkTie(board)) {
                                    System.out.println("Tie!");
                                    break;
                                }
                            }
                        } else {
                            if (board[1] == ' ') {
                                board[1] = currentPlayer;
                                printBoard(board);
                                if (checkWin(board)) {
                                    System.out.println(currentPlayer + " Wins!");
                                    break;
                                }
                                else if (checkTie(board)) {
                                    System.out.println("Tie!");
                                    break;
                                }
                            } else if (board[3] == ' ') {
                                board[3] = currentPlayer;
                                printBoard(board);
                                if (checkWin(board)) {
                                    System.out.println(currentPlayer + " Wins!");
                                    break;
                                }
                                else if (checkTie(board)) {
                                    System.out.println("Tie!");
                                    break;
                                }
                            } else if (board[5] == ' ') {
                                board[5] = currentPlayer;
                                printBoard(board);
                                if (checkWin(board)) {
                                    System.out.println(currentPlayer + " Wins!");
                                    break;
                                }
                                else if (checkTie(board)) {
                                    System.out.println("Tie!");
                                    break;
                                }
                            }  else if (board[7] == ' ') {
                                board[7] = currentPlayer;
                                printBoard(board);
                                if (checkWin(board)) {
                                    System.out.println(currentPlayer + " Wins!");
                                    break;
                                }
                                else if (checkTie(board)) {
                                    System.out.println("Tie!");
                                    break;
                                }
                            }
                        }
                    }
                } else if (position == 5) {
                    if (board[0] == ' ') {
                        board[0] = currentPlayer;
                        printBoard(board);
                        if (checkWin(board)) {
                            System.out.println(currentPlayer + " Wins!");
                            break;
                        }
                        else if (checkTie(board)) {
                            System.out.println("Tie!");
                            break;
                        }
                    } else if (board[2] == ' ') {
                        board[2] = currentPlayer;
                        printBoard(board);
                        if (checkWin(board)) {
                            System.out.println(currentPlayer + " Wins!");
                            break;
                        }
                        else if (checkTie(board)) {
                            System.out.println("Tie!");
                            break;
                        }
                    } else if (board[6] == ' ') {
                        board[6] = currentPlayer;
                        printBoard(board);
                        if (checkWin(board)) {
                            System.out.println(currentPlayer + " Wins!");
                            break;
                        }
                        else if (checkTie(board)) {
                            System.out.println("Tie!");
                            break;
                        }
                    }  else if (board[8] == ' ') {
                        board[8] = currentPlayer;
                        printBoard(board);
                        if (checkWin(board)) {
                            System.out.println(currentPlayer + " Wins!");
                            break;
                        }
                        else if (checkTie(board)) {
                            System.out.println("Tie!");
                            break;
                        }
                    }
                } else {
                    if (board[4] == ' ') {
                        board[4] = currentPlayer;
                        printBoard(board);
                        if (checkWin(board)) {
                            System.out.println(currentPlayer + " Wins!");
                            break;
                        }
                        else if (checkTie(board)) {
                            System.out.println("Tie!");
                            break;
                        }
                        else {
                            continue;
                        }
                    }
                    if ((board[0] == board[1]) && board[0] == 'X') {
                        if (board[2] == ' ') {
                            board[2] = currentPlayer;
                            printBoard(board);
                            if (checkWin(board)) {
                                System.out.println(currentPlayer + " Wins!");
                                break;
                            }
                            else if (checkTie(board)) {
                                System.out.println("Tie!");
                                break;
                            }
                            else {
                                continue;
                            }
                        }
                    }
                    if ((board[0] == board[2]) && board[0] == 'X') {
                        if (board[1] == ' ') {
                            board[1] = currentPlayer;
                            printBoard(board);
                            if (checkWin(board)) {
                                System.out.println(currentPlayer + " Wins!");
                                break;
                            }
                            else if (checkTie(board)) {
                                System.out.println("Tie!");
                                break;
                            }
                            else {
                                continue;
                            }
                        }
                    }
                    if ((board[0] == board[4]) && board[0] == 'X') {
                        if (board[8] == ' ') {
                            board[8] = currentPlayer;
                            printBoard(board);
                            if (checkWin(board)) {
                                System.out.println(currentPlayer + " Wins!");
                                break;
                            }
                            else if (checkTie(board)) {
                                System.out.println("Tie!");
                                break;
                            }
                            else {
                                continue;
                            }
                        }
                    }
                    if ((board[0] == board[8]) && board[0] == 'X') {
                        if (board[4] == ' ') {
                            board[4] = currentPlayer;
                            printBoard(board);
                            if (checkWin(board)) {
                                System.out.println(currentPlayer + " Wins!");
                                break;
                            }
                            else if (checkTie(board)) {
                                System.out.println("Tie!");
                                break;
                            }
                            else {
                                continue;
                            }
                        }
                    }
                    if ((board[0] == board[3]) && board[0] == 'X') {
                        if (board[6] == ' ') {
                            board[6] = currentPlayer;
                            printBoard(board);
                            if (checkWin(board)) {
                                System.out.println(currentPlayer + " Wins!");
                                break;
                            }
                            else if (checkTie(board)) {
                                System.out.println("Tie!");
                                break;
                            }
                            else {
                                continue;
                            }
                        }
                    }
                    if ((board[0] == board[6]) && board[0] == 'X') {
                        if (board[3] == ' ') {
                            board[3] = currentPlayer;
                            printBoard(board);
                            if (checkWin(board)) {
                                System.out.println(currentPlayer + " Wins!");
                                break;
                            }
                            else if (checkTie(board)) {
                                System.out.println("Tie!");
                                break;
                            }
                            else {
                                continue;
                            }
                        }
                    }
                    if ((board[1] == board[2]) && board[1] == 'X') {
                        if (board[0] == ' ') {
                            board[0] = currentPlayer;
                            printBoard(board);
                            if (checkWin(board)) {
                                System.out.println(currentPlayer + " Wins!");
                                break;
                            }
                            else if (checkTie(board)) {
                                System.out.println("Tie!");
                                break;
                            }
                            else {
                                continue;
                            }
                        }
                    }
                    if ((board[1] == board[4]) && board[1] == 'X') {
                        if (board[7] == ' ') {
                            board[7] = currentPlayer;
                            printBoard(board);
                            if (checkWin(board)) {
                                System.out.println(currentPlayer + " Wins!");
                                break;
                            }
                            else if (checkTie(board)) {
                                System.out.println("Tie!");
                                break;
                            }
                            else {
                                continue;
                            }
                        }
                    }
                    if ((board[2] == board[4]) && board[2] == 'X') {
                        if (board[6] == ' ') {
                            board[6] = currentPlayer;
                            printBoard(board);
                            if (checkWin(board)) {
                                System.out.println(currentPlayer + " Wins!");
                                break;
                            }
                            else if (checkTie(board)) {
                                System.out.println("Tie!");
                                break;
                            }
                            else {
                                continue;
                            }
                        }
                    }
                    if ((board[2] == board[5]) && board[2] == 'X') {
                        if (board[8] == ' ') {
                            board[8] = currentPlayer;
                            printBoard(board);
                            if (checkWin(board)) {
                                System.out.println(currentPlayer + " Wins!");
                                break;
                            }
                            else if (checkTie(board)) {
                                System.out.println("Tie!");
                                break;
                            }
                            else {
                                continue;
                            }
                        }
                    }
                    if ((board[2] == board[8]) && board[2] == 'X') {
                        if (board[5] == ' ') {
                            board[5] = currentPlayer;
                            printBoard(board);
                            if (checkWin(board)) {
                                System.out.println(currentPlayer + " Wins!");
                                break;
                            }
                            else if (checkTie(board)) {
                                System.out.println("Tie!");
                                break;
                            }
                            else {
                                continue;
                            }
                        }
                    }
                    if ((board[3] == board[4]) && board[3] == 'X') {
                        if (board[5] == ' ') {
                            board[5] = currentPlayer;
                            printBoard(board);
                            if (checkWin(board)) {
                                System.out.println(currentPlayer + " Wins!");
                                break;
                            }
                            else if (checkTie(board)) {
                                System.out.println("Tie!");
                                break;
                            }
                            else {
                                continue;
                            }
                        }
                    }
                    if ((board[3] == board[5]) && board[3] == 'X') {
                        if (board[4] == ' ') {
                            board[4] = currentPlayer;
                            printBoard(board);
                            if (checkWin(board)) {
                                System.out.println(currentPlayer + " Wins!");
                                break;
                            }
                            else if (checkTie(board)) {
                                System.out.println("Tie!");
                                break;
                            }
                            else {
                                continue;
                            }
                        }
                    }
                    if ((board[3] == board[6]) && board[3] == 'X') {
                        if (board[0] == ' ') {
                            board[4] = currentPlayer;
                            printBoard(board);
                            if (checkWin(board)) {
                                System.out.println(currentPlayer + " Wins!");
                                break;
                            }
                            else if (checkTie(board)) {
                                System.out.println("Tie!");
                                break;
                            }
                            else {
                                continue;
                            }
                        }
                    }
                    if ((board[4] == board[8]) && board[4] == 'X') {
                        if (board[0] == ' ') {
                            board[0] = currentPlayer;
                            printBoard(board);
                            if (checkWin(board)) {
                                System.out.println(currentPlayer + " Wins!");
                                break;
                            }
                            else if (checkTie(board)) {
                                System.out.println("Tie!");
                                break;
                            }
                            else {
                                continue;
                            }
                        }
                    }
                    if ((board[4] == board[7]) && board[4] == 'X') {
                        if (board[1] == ' ') {
                            board[1] = currentPlayer;
                            printBoard(board);
                            if (checkWin(board)) {
                                System.out.println(currentPlayer + " Wins!");
                                break;
                            }
                            else if (checkTie(board)) {
                                System.out.println("Tie!");
                                break;
                            }
                            else {
                                continue;
                            }
                        }
                    }
                    if ((board[4] == board[6]) && board[4] == 'X') {
                        if (board[2] == ' ') {
                            board[2] = currentPlayer;
                            printBoard(board);
                            if (checkWin(board)) {
                                System.out.println(currentPlayer + " Wins!");
                                break;
                            }
                            else if (checkTie(board)) {
                                System.out.println("Tie!");
                                break;
                            }
                            else {
                                continue;
                            }
                        }
                    }
                    if ((board[4] == board[5]) && board[4] == 'X') {
                        if (board[3] == ' ') {
                            board[3] = currentPlayer;
                            printBoard(board);
                            if (checkWin(board)) {
                                System.out.println(currentPlayer + " Wins!");
                                break;
                            }
                            else if (checkTie(board)) {
                                System.out.println("Tie!");
                                break;
                            }
                            else {
                                continue;
                            }
                        }
                    }
                    if ((board[5] == board[8]) && board[5] == 'X') {
                        if (board[2] == ' ') {
                            board[2] = currentPlayer;
                            printBoard(board);
                            if (checkWin(board)) {
                                System.out.println(currentPlayer + " Wins!");
                                break;
                            }
                            else if (checkTie(board)) {
                                System.out.println("Tie!");
                                break;
                            }
                            else {
                                continue;
                            }
                        }
                    }
                    if ((board[6] == board[2]) && board[6] == 'X') {
                        if (board[4] == ' ') {
                            board[4] = currentPlayer;
                            printBoard(board);
                            if (checkWin(board)) {
                                System.out.println(currentPlayer + " Wins!");
                                break;
                            }
                            else if (checkTie(board)) {
                                System.out.println("Tie!");
                                break;
                            }
                            else {
                                continue;
                            }
                        }
                    }
                    if ((board[6] == board[7]) && board[6] == 'X') {
                        if (board[8] == ' ') {
                            board[8] = currentPlayer;
                            printBoard(board);
                            if (checkWin(board)) {
                                System.out.println(currentPlayer + " Wins!");
                                break;
                            }
                            else if (checkTie(board)) {
                                System.out.println("Tie!");
                                break;
                            }
                            else {
                                continue;
                            }
                        }
                    }
                    if ((board[6] == board[8]) && board[6] == 'X') {
                        if (board[7] == ' ') {
                            board[7] = currentPlayer;
                            printBoard(board);
                            if (checkWin(board)) {
                                System.out.println(currentPlayer + " Wins!");
                                break;
                            }
                            else if (checkTie(board)) {
                                System.out.println("Tie!");
                                break;
                            }
                            else {
                                continue;
                            }
                        }
                    }
                    if ((board[7] == board[1]) && board[7] == 'X') {
                        if (board[4] == ' ') {
                            board[4] = currentPlayer;
                            printBoard(board);
                            if (checkWin(board)) {
                                System.out.println(currentPlayer + " Wins!");
                                break;
                            }
                            else if (checkTie(board)) {
                                System.out.println("Tie!");
                                break;
                            }
                            else {
                                continue;
                            }
                        }
                    }
                    if ((board[7] == board[8]) && board[7] == 'X') {
                        if (board[6] == ' ') {
                            board[6] = currentPlayer;
                            printBoard(board);
                            if (checkWin(board)) {
                                System.out.println(currentPlayer + " Wins!");
                                break;
                            }
                            else if (checkTie(board)) {
                                System.out.println("Tie!");
                                break;
                            }
                        }
                    }
                    else {
                        for (int i = 0; i < board.length; i++) {
                            if (board[i] == ' ') {
                                board[i] = currentPlayer;
                                break;
                            }
                        }
                        printBoard(board);
                        if (checkWin(board)) {
                            System.out.println(currentPlayer + " Wins!");
                            break;
                        } else if (checkTie(board)) {
                            System.out.println("Tie!");
                            break;
                        }
                    }
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextLine();
            }
        }
    }

    private static void printBoard(char[] board) {
        System.out.println(" _________________");
        System.out.println("|     |     |     |");
        System.out.println("|  "+board[0]+"  |  "+board[1]+"  |  "+board[2]+"  |");
        System.out.println("|_____|_____|_____|");
        System.out.println("|     |     |     |");
        System.out.println("|  "+board[3]+"  |  "+board[4]+"  |  "+board[5]+"  |");
        System.out.println("|_____|_____|_____|");
        System.out.println("|     |     |     |");
        System.out.println("|  "+board[6]+"  |  "+board[7]+"  |  "+board[8]+"  |");
        System.out.println("|_____|_____|_____|");
    }

    private static boolean checkWin(char[] board) {
        return ((board[0]==board[1]) && (board[1] == board[2]) && board[0] != ' ')||
                ((board[3]==board[4]) && (board[4] == board[5]) && board[3] != ' ')||
                ((board[6]==board[7]) && (board[7] == board[8]) && board[6] != ' ')||
                ((board[0]==board[3]) && (board[3] == board[6]) && board[0] != ' ')||
                ((board[1]==board[4]) && (board[4] == board[7]) && board[1] != ' ')||
                ((board[2]==board[5]) && (board[5] == board[8]) && board[2] != ' ')||
                ((board[0]==board[4]) && (board[4] == board[8]) && board[0] != ' ')||
                ((board[2]==board[4]) && (board[4] == board[6]) && board[2] != ' ');
    }

    private static boolean checkTie(char[] board) {
        for (char i: board) {
            if (i == ' ') {
                return false;
            }
        }
        return true;
    }

    private static char changePlayer(char currentPlayer) {
        return currentPlayer == 'X' ? 'O' : 'X';
    }

    private static void playAgain() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.nextLine();
            while (!playAgain.equalsIgnoreCase("yes") && !playAgain.equalsIgnoreCase("no")) {
                System.out.print("Enter 'yes' or 'no': ");
                playAgain = scanner.nextLine();
            }
            if (playAgain.equalsIgnoreCase("yes")) {
                play();
            } else {
                break;
            }
        }
    }

    public static void main(String[] args) {
        play();
        playAgain();
    }
}