.class public final LM0/h;
.super LM0/d;
.source "SourceFile"


# instance fields
.field public d0:F

.field public e0:I

.field public f0:I

.field public g0:LM0/c;

.field public h0:I


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, LM0/d;-><init>()V

    const/high16 v0, -0x40800000    # -1.0f

    iput v0, p0, LM0/h;->d0:F

    const/4 v0, -0x1

    iput v0, p0, LM0/h;->e0:I

    iput v0, p0, LM0/h;->f0:I

    iget-object v0, p0, LM0/d;->y:LM0/c;

    iput-object v0, p0, LM0/h;->g0:LM0/c;

    const/4 v0, 0x0

    iput v0, p0, LM0/h;->h0:I

    iget-object v1, p0, LM0/d;->G:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    iget-object v1, p0, LM0/d;->G:Ljava/util/ArrayList;

    iget-object v2, p0, LM0/h;->g0:LM0/c;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, LM0/d;->F:[LM0/c;

    array-length v1, v1

    :goto_0
    if-ge v0, v1, :cond_0

    iget-object v2, p0, LM0/d;->F:[LM0/c;

    iget-object v3, p0, LM0/h;->g0:LM0/c;

    aput-object v3, v2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public final A(LL0/e;)V
    .locals 3

    iget-object v0, p0, LM0/d;->I:LM0/d;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LM0/h;->g0:LM0/c;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, LL0/e;->m(Ljava/lang/Object;)I

    move-result p1

    iget v0, p0, LM0/h;->h0:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-ne v0, v1, :cond_1

    iput p1, p0, LM0/d;->N:I

    iput v2, p0, LM0/d;->O:I

    iget-object p1, p0, LM0/d;->I:LM0/d;

    invoke-virtual {p1}, LM0/d;->i()I

    move-result p1

    invoke-virtual {p0, p1}, LM0/d;->v(I)V

    invoke-virtual {p0, v2}, LM0/d;->y(I)V

    goto :goto_0

    :cond_1
    iput v2, p0, LM0/d;->N:I

    iput p1, p0, LM0/d;->O:I

    iget-object p1, p0, LM0/d;->I:LM0/d;

    invoke-virtual {p1}, LM0/d;->l()I

    move-result p1

    invoke-virtual {p0, p1}, LM0/d;->y(I)V

    invoke-virtual {p0, v2}, LM0/d;->v(I)V

    :goto_0
    return-void
.end method

.method public final B(I)V
    .locals 3

    iget v0, p0, LM0/h;->h0:I

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    iput p1, p0, LM0/h;->h0:I

    iget-object p1, p0, LM0/d;->G:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    iget v0, p0, LM0/h;->h0:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    iget-object v0, p0, LM0/d;->x:LM0/c;

    iput-object v0, p0, LM0/h;->g0:LM0/c;

    goto :goto_0

    :cond_1
    iget-object v0, p0, LM0/d;->y:LM0/c;

    iput-object v0, p0, LM0/h;->g0:LM0/c;

    :goto_0
    iget-object v0, p0, LM0/h;->g0:LM0/c;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, LM0/d;->F:[LM0/c;

    array-length v0, p1

    const/4 v1, 0x0

    :goto_1
    if-ge v1, v0, :cond_2

    iget-object v2, p0, LM0/h;->g0:LM0/c;

    aput-object v2, p1, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    return-void
.end method

.method public final a(LL0/e;)V
    .locals 9

    iget-object v0, p0, LM0/d;->I:LM0/d;

    check-cast v0, LM0/e;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x2

    invoke-virtual {v0, v1}, LM0/d;->g(I)LM0/c;

    move-result-object v2

    const/4 v3, 0x4

    invoke-virtual {v0, v3}, LM0/d;->g(I)LM0/c;

    move-result-object v3

    iget-object v4, p0, LM0/d;->I:LM0/d;

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v4, :cond_1

    iget-object v4, v4, LM0/d;->c0:[I

    aget v4, v4, v6

    if-ne v4, v1, :cond_1

    move v4, v5

    goto :goto_0

    :cond_1
    move v4, v6

    :goto_0
    iget v7, p0, LM0/h;->h0:I

    const/4 v8, 0x5

    if-nez v7, :cond_3

    const/4 v2, 0x3

    invoke-virtual {v0, v2}, LM0/d;->g(I)LM0/c;

    move-result-object v2

    invoke-virtual {v0, v8}, LM0/d;->g(I)LM0/c;

    move-result-object v3

    iget-object v0, p0, LM0/d;->I:LM0/d;

    if-eqz v0, :cond_2

    iget-object v0, v0, LM0/d;->c0:[I

    aget v0, v0, v5

    if-ne v0, v1, :cond_2

    goto :goto_1

    :cond_2
    move v5, v6

    :goto_1
    move v4, v5

    :cond_3
    iget v0, p0, LM0/h;->e0:I

    const/16 v1, 0x8

    const/4 v5, -0x1

    if-eq v0, v5, :cond_4

    iget-object v0, p0, LM0/h;->g0:LM0/c;

    invoke-virtual {p1, v0}, LL0/e;->j(Ljava/lang/Object;)LL0/j;

    move-result-object v0

    invoke-virtual {p1, v2}, LL0/e;->j(Ljava/lang/Object;)LL0/j;

    move-result-object v2

    iget v5, p0, LM0/h;->e0:I

    invoke-virtual {p1, v0, v2, v5, v1}, LL0/e;->e(LL0/j;LL0/j;II)V

    if-eqz v4, :cond_6

    invoke-virtual {p1, v3}, LL0/e;->j(Ljava/lang/Object;)LL0/j;

    move-result-object v1

    invoke-virtual {p1, v1, v0, v6, v8}, LL0/e;->f(LL0/j;LL0/j;II)V

    goto :goto_2

    :cond_4
    iget v0, p0, LM0/h;->f0:I

    if-eq v0, v5, :cond_5

    iget-object v0, p0, LM0/h;->g0:LM0/c;

    invoke-virtual {p1, v0}, LL0/e;->j(Ljava/lang/Object;)LL0/j;

    move-result-object v0

    invoke-virtual {p1, v3}, LL0/e;->j(Ljava/lang/Object;)LL0/j;

    move-result-object v3

    iget v5, p0, LM0/h;->f0:I

    neg-int v5, v5

    invoke-virtual {p1, v0, v3, v5, v1}, LL0/e;->e(LL0/j;LL0/j;II)V

    if-eqz v4, :cond_6

    invoke-virtual {p1, v2}, LL0/e;->j(Ljava/lang/Object;)LL0/j;

    move-result-object v1

    invoke-virtual {p1, v0, v1, v6, v8}, LL0/e;->f(LL0/j;LL0/j;II)V

    invoke-virtual {p1, v3, v0, v6, v8}, LL0/e;->f(LL0/j;LL0/j;II)V

    goto :goto_2

    :cond_5
    iget v0, p0, LM0/h;->d0:F

    const/high16 v1, -0x40800000    # -1.0f

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_6

    iget-object v0, p0, LM0/h;->g0:LM0/c;

    invoke-virtual {p1, v0}, LL0/e;->j(Ljava/lang/Object;)LL0/j;

    move-result-object v0

    invoke-virtual {p1, v3}, LL0/e;->j(Ljava/lang/Object;)LL0/j;

    move-result-object v2

    iget v3, p0, LM0/h;->d0:F

    invoke-virtual {p1}, LL0/e;->k()LL0/c;

    move-result-object v4

    iget-object v5, v4, LL0/c;->d:LL0/b;

    invoke-interface {v5, v0, v1}, LL0/b;->b(LL0/j;F)V

    iget-object v0, v4, LL0/c;->d:LL0/b;

    invoke-interface {v0, v2, v3}, LL0/b;->b(LL0/j;F)V

    invoke-virtual {p1, v4}, LL0/e;->c(LL0/c;)V

    :cond_6
    :goto_2
    return-void
.end method

.method public final b()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final g(I)LM0/c;
    .locals 2

    invoke-static {p1}, Lp/f;->b(I)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    iget v0, p0, LM0/h;->h0:I

    if-nez v0, :cond_0

    iget-object p1, p0, LM0/h;->g0:LM0/c;

    return-object p1

    :pswitch_1
    iget v0, p0, LM0/h;->h0:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object p1, p0, LM0/h;->g0:LM0/c;

    return-object p1

    :cond_0
    :goto_0
    new-instance v0, Ljava/lang/AssertionError;

    invoke-static {p1}, LA/a;->m(I)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :pswitch_2
    const/4 p1, 0x0

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
    .end packed-switch
.end method
