.class public final LB2/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB2/f;


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ly2/u;I)V
    .locals 0

    .line 1
    iput p3, p0, LB2/n;->d:I

    iput-object p1, p0, LB2/n;->e:Ljava/lang/Object;

    iput-object p2, p0, LB2/n;->f:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lo2/e;Lp2/o;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LB2/n;->d:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    check-cast p1, Li2/j;

    iput-object p1, p0, LB2/n;->e:Ljava/lang/Object;

    iput-object p2, p0, LB2/n;->f:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Lg2/d;)Ljava/lang/Object;
    .locals 11

    iget v0, p0, LB2/n;->d:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ls/f;

    instance-of p2, p1, Ls/k;

    iget-object v0, p0, LB2/n;->e:Ljava/lang/Object;

    check-cast v0, Lz/w;

    if-eqz p2, :cond_1

    iget-boolean p2, v0, Lz/w;->y:Z

    if-eqz p2, :cond_0

    check-cast p1, Ls/k;

    invoke-virtual {v0, p1}, Lz/w;->h0(Ls/k;)V

    goto :goto_0

    :cond_0
    iget-object p2, v0, Lz/w;->z:Ln/x;

    invoke-virtual {p2, p1}, Ln/x;->a(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    iget-object p2, v0, Lz/w;->v:LZ/a;

    if-nez p2, :cond_2

    new-instance p2, LZ/a;

    iget-object v1, v0, Lz/w;->u:LA/u;

    iget-boolean v2, v0, Lz/w;->r:Z

    invoke-direct {p2, v2, v1}, LZ/a;-><init>(ZLo2/a;)V

    invoke-static {v0}, Ln0/C;->k(Ln0/k;)V

    iput-object p2, v0, Lz/w;->v:LZ/a;

    :cond_2
    iget-object v0, p0, LB2/n;->f:Ljava/lang/Object;

    check-cast v0, Ly2/u;

    invoke-virtual {p2, p1, v0}, LZ/a;->b(Ls/f;Ly2/u;)V

    :goto_0
    sget-object p1, Lc2/m;->a:Lc2/m;

    return-object p1

    :pswitch_0
    check-cast p1, Ls/f;

    instance-of p2, p1, Ls/i;

    iget-object v0, p0, LB2/n;->e:Ljava/lang/Object;

    check-cast v0, Lz/a;

    if-eqz p2, :cond_4

    move-object v2, p1

    check-cast v2, Ls/i;

    iget-object p1, v0, Lz/a;->k:Lz/r;

    if-eqz p1, :cond_3

    goto :goto_1

    :cond_3
    iget-object p1, v0, Lz/a;->j:Landroid/view/ViewGroup;

    invoke-static {p1}, Lz/A;->a(Landroid/view/ViewGroup;)Lz/r;

    move-result-object p1

    iput-object p1, v0, Lz/a;->k:Lz/r;

    invoke-static {p1}, Lp2/g;->b(Ljava/lang/Object;)V

    :goto_1
    invoke-virtual {p1, v0}, Lz/r;->a(Lz/s;)Lz/t;

    move-result-object p1

    iget-wide v4, v0, Lz/a;->n:J

    iget v6, v0, Lz/a;->o:I

    iget-object p2, v0, Lz/a;->h:LD/Z;

    invoke-interface {p2}, LD/L0;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LW/r;

    iget-wide v7, p2, LW/r;->a:J

    iget-object p2, v0, Lz/a;->i:LD/Z;

    invoke-interface {p2}, LD/L0;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lz/h;

    iget v9, p2, Lz/h;->d:F

    iget-object v10, v0, Lz/a;->p:LA0/c;

    iget-boolean v3, v0, Lz/a;->f:Z

    move-object v1, p1

    invoke-virtual/range {v1 .. v10}, Lz/t;->b(Ls/i;ZJIJFLo2/a;)V

    iget-object p2, v0, Lz/a;->l:LD/f0;

    invoke-virtual {p2, p1}, LD/f0;->setValue(Ljava/lang/Object;)V

    goto :goto_2

    :cond_4
    instance-of p2, p1, Ls/j;

    if-eqz p2, :cond_5

    check-cast p1, Ls/j;

    iget-object p1, p1, Ls/j;->a:Ls/i;

    iget-object p1, v0, Lz/a;->l:LD/f0;

    invoke-virtual {p1}, LD/f0;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lz/t;

    if-eqz p1, :cond_7

    invoke-virtual {p1}, Lz/t;->d()V

    goto :goto_2

    :cond_5
    instance-of p2, p1, Ls/h;

    if-eqz p2, :cond_6

    check-cast p1, Ls/h;

    iget-object p1, p1, Ls/h;->a:Ls/i;

    iget-object p1, v0, Lz/a;->l:LD/f0;

    invoke-virtual {p1}, LD/f0;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lz/t;

    if-eqz p1, :cond_7

    invoke-virtual {p1}, Lz/t;->d()V

    goto :goto_2

    :cond_6
    iget-object p2, v0, Lz/a;->e:LZ/a;

    iget-object v0, p0, LB2/n;->f:Ljava/lang/Object;

    check-cast v0, Ly2/u;

    invoke-virtual {p2, p1, v0}, LZ/a;->b(Ls/f;Ly2/u;)V

    :cond_7
    :goto_2
    sget-object p1, Lc2/m;->a:Lc2/m;

    return-object p1

    :pswitch_1
    instance-of v0, p2, LB2/m;

    if-eqz v0, :cond_8

    move-object v0, p2

    check-cast v0, LB2/m;

    iget v1, v0, LB2/m;->i:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_8

    sub-int/2addr v1, v2

    iput v1, v0, LB2/m;->i:I

    goto :goto_3

    :cond_8
    new-instance v0, LB2/m;

    invoke-direct {v0, p0, p2}, LB2/m;-><init>(LB2/n;Lg2/d;)V

    :goto_3
    iget-object p2, v0, LB2/m;->h:Ljava/lang/Object;

    sget-object v1, Lh2/a;->d:Lh2/a;

    iget v2, v0, LB2/m;->i:I

    const/4 v3, 0x1

    if-eqz v2, :cond_a

    if-ne v2, v3, :cond_9

    iget-object p1, v0, LB2/m;->k:Ljava/lang/Object;

    iget-object v0, v0, LB2/m;->g:LB2/n;

    invoke-static {p2}, LZ0/d;->U(Ljava/lang/Object;)V

    goto :goto_4

    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_a
    invoke-static {p2}, LZ0/d;->U(Ljava/lang/Object;)V

    iput-object p0, v0, LB2/m;->g:LB2/n;

    iput-object p1, v0, LB2/m;->k:Ljava/lang/Object;

    iput v3, v0, LB2/m;->i:I

    iget-object p2, p0, LB2/n;->e:Ljava/lang/Object;

    check-cast p2, Li2/j;

    invoke-interface {p2, p1, v0}, Lo2/e;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_b

    goto :goto_5

    :cond_b
    move-object v0, p0

    :goto_4
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-nez p2, :cond_c

    sget-object v1, Lc2/m;->a:Lc2/m;

    :goto_5
    return-object v1

    :cond_c
    iget-object p2, v0, LB2/n;->f:Ljava/lang/Object;

    check-cast p2, Lp2/o;

    iput-object p1, p2, Lp2/o;->d:Ljava/lang/Object;

    new-instance p1, LC2/a;

    invoke-direct {p1, v0}, LC2/a;-><init>(LB2/n;)V

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
