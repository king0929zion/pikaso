.class public final LB2/r;
.super Li2/j;
.source "SourceFile"

# interfaces
.implements Lo2/e;


# instance fields
.field public h:I

.field public final synthetic i:LB2/D;

.field public final synthetic j:LB2/e;

.field public final synthetic k:LB2/G;

.field public final synthetic l:Ljava/lang/Float;


# direct methods
.method public constructor <init>(LB2/D;LB2/e;LB2/G;Ljava/lang/Float;Lg2/d;)V
    .locals 0

    iput-object p1, p0, LB2/r;->i:LB2/D;

    iput-object p2, p0, LB2/r;->j:LB2/e;

    iput-object p3, p0, LB2/r;->k:LB2/G;

    iput-object p4, p0, LB2/r;->l:Ljava/lang/Float;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Li2/j;-><init>(ILg2/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lg2/d;Ljava/lang/Object;)Lg2/d;
    .locals 6

    new-instance p2, LB2/r;

    iget-object v3, p0, LB2/r;->k:LB2/G;

    iget-object v4, p0, LB2/r;->l:Ljava/lang/Float;

    iget-object v1, p0, LB2/r;->i:LB2/D;

    iget-object v2, p0, LB2/r;->j:LB2/e;

    move-object v0, p2

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, LB2/r;-><init>(LB2/D;LB2/e;LB2/G;Ljava/lang/Float;Lg2/d;)V

    return-object p2
.end method

.method public final h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ly2/u;

    check-cast p2, Lg2/d;

    invoke-virtual {p0, p2, p1}, LB2/r;->f(Lg2/d;Ljava/lang/Object;)Lg2/d;

    move-result-object p1

    check-cast p1, LB2/r;

    sget-object p2, Lc2/m;->a:Lc2/m;

    invoke-virtual {p1, p2}, LB2/r;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    move-object/from16 v0, p0

    const/4 v1, 0x0

    sget-object v2, Lh2/a;->d:Lh2/a;

    iget v3, v0, LB2/r;->h:I

    sget-object v4, Lc2/m;->a:Lc2/m;

    iget-object v5, v0, LB2/r;->j:LB2/e;

    iget-object v6, v0, LB2/r;->k:LB2/G;

    const/4 v7, 0x2

    const/4 v8, 0x1

    const/4 v9, 0x4

    const/4 v10, 0x3

    if-eqz v3, :cond_3

    if-eq v3, v8, :cond_2

    if-eq v3, v7, :cond_1

    if-eq v3, v10, :cond_2

    if-ne v3, v9, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static/range {p1 .. p1}, LZ0/d;->U(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    :goto_0
    invoke-static/range {p1 .. p1}, LZ0/d;->U(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_3
    invoke-static/range {p1 .. p1}, LZ0/d;->U(Ljava/lang/Object;)V

    sget-object v3, LB2/z;->a:LB2/A;

    iget-object v11, v0, LB2/r;->i:LB2/D;

    if-ne v11, v3, :cond_4

    iput v8, v0, LB2/r;->h:I

    invoke-interface {v5, v6, v0}, LB2/e;->o(LB2/f;Lg2/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_9

    return-object v2

    :cond_4
    sget-object v3, LB2/z;->b:LB2/A;

    const/4 v12, 0x0

    if-ne v11, v3, :cond_6

    invoke-virtual {v6}, LC2/b;->f()LC2/z;

    move-result-object v1

    new-instance v3, LB2/p;

    invoke-direct {v3, v7, v12}, Li2/j;-><init>(ILg2/d;)V

    iput v7, v0, LB2/r;->h:I

    invoke-static {v1, v3, v0}, LB2/w;->d(LB2/e;Lo2/e;Li2/c;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_5

    return-object v2

    :cond_5
    :goto_1
    iput v10, v0, LB2/r;->h:I

    invoke-interface {v5, v6, v0}, LB2/e;->o(LB2/f;Lg2/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_9

    return-object v2

    :cond_6
    invoke-virtual {v6}, LC2/b;->f()LC2/z;

    move-result-object v15

    new-instance v14, LB2/B;

    invoke-direct {v14, v11, v12}, LB2/B;-><init>(LB2/D;Lg2/d;)V

    sget v3, LB2/l;->a:I

    new-instance v3, LC2/n;

    sget-object v10, Lg2/j;->d:Lg2/j;

    const/16 v17, -0x2

    const/16 v18, 0x1

    move-object v13, v3

    move-object/from16 v16, v10

    invoke-direct/range {v13 .. v18}, LC2/n;-><init>(Lo2/f;LB2/e;Lg2/i;II)V

    new-instance v11, LB2/C;

    invoke-direct {v11, v7, v12}, Li2/j;-><init>(ILg2/d;)V

    new-instance v7, LB2/i;

    invoke-direct {v7, v3, v1, v11}, LB2/i;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-static {v7}, LB2/w;->b(LB2/e;)LB2/e;

    move-result-object v3

    invoke-static {v3}, LB2/w;->b(LB2/e;)LB2/e;

    move-result-object v18

    new-instance v3, LB2/q;

    iget-object v7, v0, LB2/r;->l:Ljava/lang/Float;

    invoke-direct {v3, v5, v6, v7, v12}, LB2/q;-><init>(LB2/e;LB2/G;Ljava/lang/Float;Lg2/d;)V

    iput v9, v0, LB2/r;->h:I

    new-instance v5, LB2/k;

    invoke-direct {v5, v3, v12}, LB2/k;-><init>(LB2/q;Lg2/d;)V

    new-instance v3, LC2/n;

    const/16 v20, -0x2

    const/16 v21, 0x1

    move-object/from16 v16, v3

    move-object/from16 v17, v5

    move-object/from16 v19, v10

    invoke-direct/range {v16 .. v21}, LC2/n;-><init>(Lo2/f;LB2/e;Lg2/i;II)V

    invoke-interface {v3, v10, v1, v8}, LC2/q;->m(Lg2/i;II)LB2/e;

    move-result-object v1

    sget-object v3, LC2/s;->d:LC2/s;

    invoke-interface {v1, v3, v0}, LB2/e;->o(LB2/f;Lg2/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_7

    goto :goto_2

    :cond_7
    move-object v1, v4

    :goto_2
    if-ne v1, v2, :cond_8

    goto :goto_3

    :cond_8
    move-object v1, v4

    :goto_3
    if-ne v1, v2, :cond_9

    return-object v2

    :cond_9
    :goto_4
    return-object v4
.end method
