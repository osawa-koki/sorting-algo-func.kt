# sorting-algo-func.kt

🎣🎣🎣 Kotlinで実装した整列アルゴリズムの関数をまとめています。  

> **Warning**  
> Dockerを使用した実行方法は、現在作成中です。  

## 実行方法

IntelliJ IDEAで`Main.kt`を実行すると、以下のような出力が得られます。  

```output
Organized            (true ) : 0 1 2 3 4 5 6 7 8 9
Shuffled             (false) : 3 2 8 1 4 5 7 0 9 6
Bubble Sort          (true ) : 0 1 2 3 4 5 6 7 8 9
Shuffled             (false) : 2 1 7 9 4 3 6 8 5 0
Selection Sort       (true ) : 0 1 2 3 4 5 6 7 8 9
Shuffled             (false) : 1 7 6 0 4 2 9 3 8 5
Insertion Sort       (true ) : 0 1 2 3 4 5 6 7 8 9
Shuffled             (false) : 4 9 0 1 8 7 5 2 6 3
Merge Sort           (true ) : 0 1 2 3 4 5 6 7 8 9
Shuffled             (false) : 4 6 8 3 9 0 7 2 5 1
Quick Sort           (true ) : 0 1 2 3 4 5 6 7 8 9
Shuffled             (false) : 1 5 8 4 6 7 9 3 0 2
Shell Sort           (true ) : 0 1 2 3 4 5 6 7 8 9
Shuffled             (false) : 4 5 6 3 1 9 0 8 7 2
Heap Sort            (true ) : 0 1 2 3 4 5 6 7 8 9
Shuffled             (false) : 1 5 9 8 4 7 0 3 2 6
Counting Sort        (true ) : 0 1 2 3 4 5 6 7 8 9
Shuffled             (false) : 0 5 7 4 6 3 1 2 8 9
Bucket Sort          (true ) : 0 1 2 3 4 5 6 7 8 9
Shuffled             (false) : 7 4 0 3 1 6 8 5 9 2
Comb Sort            (true ) : 0 1 2 3 4 5 6 7 8 9
Shuffled             (false) : 2 3 5 6 4 7 0 8 9 1
Cycle Sort           (true ) : 0 1 2 3 4 5 6 7 8 9
Shuffled             (false) : 0 9 1 8 3 2 4 7 6 5
Pancake Sort         (true ) : 0 1 2 3 4 5 6 7 8 9
Shuffled             (false) : 1 7 2 6 8 4 9 5 0 3
Gnome Sort           (true ) : 0 1 2 3 4 5 6 7 8 9
Shuffled             (false) : 4 0 6 2 1 8 5 9 3 7
Stooge Sort          (true ) : 0 1 2 3 4 5 6 7 8 9
Shuffled             (false) : 3 8 7 4 2 1 5 6 0 9
Pigeonhole Sort      (true ) : 0 1 2 3 4 5 6 7 8 9
Shuffled             (false) : 1 5 6 2 8 0 7 4 9 3
Odd-Even Sort        (true ) : 0 1 2 3 4 5 6 7 8 9
Shuffled             (false) : 8 7 0 4 6 3 1 2 5 9
Cocktail Sort        (true ) : 0 1 2 3 4 5 6 7 8 9
Shuffled             (false) : 3 2 0 4 7 9 8 5 6 1
Strand Sort          (true ) : 0 1 2 3 4 5 6 7 8 9
```

---

`test`ディレクトリ内にテストコードを記述しています。  

| テストコード | 説明 |
| --- | --- |
| ShuffleTest | 引数として渡された配列をシャッフルする関数のテスト |
| IsSortedTest | 引数として渡された配列がソートされているかを確認する関数のテスト |
| SortingAlgoTest | 各アルゴリズムを実装した関数が正しく配列を整列できているかを確認するテスト |

## 実装したアルゴリズム

- [x] バブルソート
- [x] 選択ソート
- [x] 挿入ソート
- [x] マージソート
- [x] クイックソート
- [x] ヒープソート
- [x] シェルソート
- [x] カウントソート
- [x] バケツソート
- [x] コムソート
- [x] サイクルソート
- [x] パンケーキソート
- [x] ノームソート
- [x] ステゥージソート
- [x] 鳩ノ巣ソート
- [x] 奇遇転置ソート
- [x] カクテルソート
- [x] ストランドソート

## 自分用メモ

### IntelliJ IDEA実行ボタンが有効化されない

`src`ディレクトリを右クリックして、`Mark Directory as` -> `Sources Root`を選択すると、実行ボタンが有効化されます。  
