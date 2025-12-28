.class public final LC2/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB2/f;


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Ljava/io/Serializable;

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic g:Ljava/lang/Object;

.field public final synthetic h:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/io/Serializable;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    iput p5, p0, LC2/l;->d:I

    iput-object p1, p0, LC2/l;->e:Ljava/io/Serializable;

    iput-object p2, p0, LC2/l;->f:Ljava/lang/Object;

    iput-object p3, p0, LC2/l;->g:Ljava/lang/Object;

    iput-object p4, p0, LC2/l;->h:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Lg2/d;)Ljava/lang/Object;
    .locals 6

    iget v0, p0, LC2/l;->d:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ls/f;

    instance-of p2, p1, Ls/i;

    iget-object v0, p0, LC2/l;->g:Ljava/lang/Object;

    check-cast v0, Lp2/n;

    iget-object v1, p0, LC2/l;->f:Ljava/lang/Object;

    check-cast v1, Lp2/n;

    iget-object v2, p0, LC2/l;->e:Ljava/io/Serializable;

    check-cast v2, Lp2/n;

    const/4 v3, 0x1

    if-eqz p2, :cond_0

    iget p1, v2, Lp2/n;->d:I

    add-int/2addr p1, v3

    iput p1, v2, Lp2/n;->d:I

    goto :goto_0

    :cond_0
    instance-of p2, p1, Ls/j;

    if-eqz p2, :cond_1

    iget p1, v2, Lp2/n;->d:I

    add-int/lit8 p1, p1, -0x1

    iput p1, v2, Lp2/n;->d:I

    goto :goto_0

    :cond_1
    instance-of p2, p1, Ls/h;

    if-eqz p2, :cond_2

    iget p1, v2, Lp2/n;->d:I

    add-int/lit8 p1, p1, -0x1

    iput p1, v2, Lp2/n;->d:I

    goto :goto_0

    :cond_2
    instance-of p2, p1, Ls/d;

    if-eqz p2, :cond_3

    iget p1, v1, Lp2/n;->d:I

    add-int/2addr p1, v3

    iput p1, v1, Lp2/n;->d:I

    goto :goto_0

    :cond_3
    instance-of p2, p1, Ls/e;

    if-eqz p2, :cond_4

    iget p1, v1, Lp2/n;->d:I

    add-int/lit8 p1, p1, -0x1

    iput p1, v1, Lp2/n;->d:I

    goto :goto_0

    :cond_4
    instance-of p2, p1, Ls/b;

    if-eqz p2, :cond_5

    iget p1, v0, Lp2/n;->d:I

    add-int/2addr p1, v3

    iput p1, v0, Lp2/n;->d:I

    goto :goto_0

    :cond_5
    instance-of p1, p1, Ls/c;

    if-eqz p1, :cond_6

    iget p1, v0, Lp2/n;->d:I

    add-int/lit8 p1, p1, -0x1

    iput p1, v0, Lp2/n;->d:I

    :cond_6
    :goto_0
    iget p1, v2, Lp2/n;->d:I

    const/4 p2, 0x0

    if-lez p1, :cond_7

    move p1, v3

    goto :goto_1

    :cond_7
    move p1, p2

    :goto_1
    iget v1, v1, Lp2/n;->d:I

    if-lez v1, :cond_8

    move v1, v3

    goto :goto_2

    :cond_8
    move v1, p2

    :goto_2
    iget v0, v0, Lp2/n;->d:I

    if-lez v0, :cond_9

    move v0, v3

    goto :goto_3

    :cond_9
    move v0, p2

    :goto_3
    iget-object v2, p0, LC2/l;->h:Ljava/lang/Object;

    check-cast v2, Lq/o;

    iget-boolean v4, v2, Lq/o;->r:Z

    if-eq v4, p1, :cond_a

    iput-boolean p1, v2, Lq/o;->r:Z

    move p2, v3

    :cond_a
    iget-boolean p1, v2, Lq/o;->s:Z

    if-eq p1, v1, :cond_b

    iput-boolean v1, v2, Lq/o;->s:Z

    move p2, v3

    :cond_b
    iget-boolean p1, v2, Lq/o;->t:Z

    if-eq p1, v0, :cond_c

    iput-boolean v0, v2, Lq/o;->t:Z

    goto :goto_4

    :cond_c
    move v3, p2

    :goto_4
    if-eqz v3, :cond_d

    invoke-static {v2}, Ln0/C;->k(Ln0/k;)V

    :cond_d
    sget-object p1, Lc2/m;->a:Lc2/m;

    return-object p1

    :pswitch_0
    instance-of v0, p2, LC2/k;

    if-eqz v0, :cond_e

    move-object v0, p2

    check-cast v0, LC2/k;

    iget v1, v0, LC2/k;->k:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_e

    sub-int/2addr v1, v2

    iput v1, v0, LC2/k;->k:I

    goto :goto_5

    :cond_e
    new-instance v0, LC2/k;

    invoke-direct {v0, p0, p2}, LC2/k;-><init>(LC2/l;Lg2/d;)V

    :goto_5
    iget-object p2, v0, LC2/k;->i:Ljava/lang/Object;

    sget-object v1, Lh2/a;->d:Lh2/a;

    iget v2, v0, LC2/k;->k:I

    const/4 v3, 0x1

    if-eqz v2, :cond_10

    if-ne v2, v3, :cond_f

    iget-object p1, v0, LC2/k;->h:Ljava/lang/Object;

    iget-object v0, v0, LC2/k;->g:LC2/l;

    invoke-static {p2}, LZ0/d;->U(Ljava/lang/Object;)V

    goto :goto_6

    :cond_f
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_10
    invoke-static {p2}, LZ0/d;->U(Ljava/lang/Object;)V

    iget-object p2, p0, LC2/l;->e:Ljava/io/Serializable;

    check-cast p2, Lp2/o;

    iget-object p2, p2, Lp2/o;->d:Ljava/lang/Object;

    check-cast p2, Ly2/S;

    if-eqz p2, :cond_11

    new-instance v2, LC2/o;

    const-string v4, "Child of the scoped flow was cancelled"

    const/4 v5, 0x0

    invoke-direct {v2, v4, v5}, LC2/o;-><init>(Ljava/lang/String;I)V

    invoke-interface {p2, v2}, Ly2/S;->a(Ljava/util/concurrent/CancellationException;)V

    iput-object p0, v0, LC2/k;->g:LC2/l;

    iput-object p1, v0, LC2/k;->h:Ljava/lang/Object;

    iput v3, v0, LC2/k;->k:I

    invoke-interface {p2, v0}, Ly2/S;->k(Li2/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_11

    goto :goto_7

    :cond_11
    move-object v0, p0

    :goto_6
    iget-object p2, v0, LC2/l;->e:Ljava/io/Serializable;

    check-cast p2, Lp2/o;

    new-instance v1, LC2/j;

    iget-object v2, v0, LC2/l;->h:Ljava/lang/Object;

    check-cast v2, LB2/f;

    iget-object v4, v0, LC2/l;->g:Ljava/lang/Object;

    check-cast v4, LC2/n;

    const/4 v5, 0x0

    invoke-direct {v1, v4, v2, p1, v5}, LC2/j;-><init>(LC2/n;LB2/f;Ljava/lang/Object;Lg2/d;)V

    iget-object p1, v0, LC2/l;->f:Ljava/lang/Object;

    check-cast p1, Ly2/u;

    const/4 v0, 0x4

    invoke-static {p1, v5, v0, v1, v3}, Ly2/v;->l(Ly2/u;Lg2/a;ILo2/e;I)Ly2/h0;

    move-result-object p1

    iput-object p1, p2, Lp2/o;->d:Ljava/lang/Object;

    sget-object v1, Lc2/m;->a:Lc2/m;

    :goto_7
    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
