.class public final Lr/m;
.super Li2/i;
.source "SourceFile"

# interfaces
.implements Lo2/e;


# instance fields
.field public f:I

.field public synthetic g:Ljava/lang/Object;

.field public final synthetic h:Ly2/u;

.field public final synthetic i:Lq/k;

.field public final synthetic j:LD/y;

.field public final synthetic k:Lr/e;


# direct methods
.method public constructor <init>(Ly2/u;Lq/k;LD/y;Lr/e;Lg2/d;)V
    .locals 0

    iput-object p1, p0, Lr/m;->h:Ly2/u;

    iput-object p2, p0, Lr/m;->i:Lq/k;

    iput-object p3, p0, Lr/m;->j:LD/y;

    iput-object p4, p0, Lr/m;->k:Lr/e;

    invoke-direct {p0, p5}, Li2/i;-><init>(Lg2/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lg2/d;Ljava/lang/Object;)Lg2/d;
    .locals 7

    new-instance v6, Lr/m;

    iget-object v3, p0, Lr/m;->j:LD/y;

    iget-object v4, p0, Lr/m;->k:Lr/e;

    iget-object v2, p0, Lr/m;->i:Lq/k;

    iget-object v1, p0, Lr/m;->h:Ly2/u;

    move-object v0, v6

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Lr/m;-><init>(Ly2/u;Lq/k;LD/y;Lr/e;Lg2/d;)V

    iput-object p2, v6, Lr/m;->g:Ljava/lang/Object;

    return-object v6
.end method

.method public final h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lh0/p;

    check-cast p2, Lg2/d;

    invoke-virtual {p0, p2, p1}, Lr/m;->f(Lg2/d;Ljava/lang/Object;)Lg2/d;

    move-result-object p1

    check-cast p1, Lr/m;

    sget-object p2, Lc2/m;->a:Lc2/m;

    invoke-virtual {p1, p2}, Lr/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    sget-object v0, Lh2/a;->d:Lh2/a;

    iget v1, p0, Lr/m;->f:I

    sget-object v2, Lh0/g;->e:Lh0/g;

    iget-object v3, p0, Lr/m;->k:Lr/e;

    const/4 v4, 0x0

    iget-object v5, p0, Lr/m;->h:Ly2/u;

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v8, 0x2

    const/4 v9, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v9, :cond_1

    if-ne v1, v8, :cond_0

    invoke-static {p1}, LZ0/d;->U(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lr/m;->g:Ljava/lang/Object;

    check-cast v1, Lh0/p;

    invoke-static {p1}, LZ0/d;->U(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, LZ0/d;->U(Ljava/lang/Object;)V

    iget-object p1, p0, Lr/m;->g:Ljava/lang/Object;

    move-object v1, p1

    check-cast v1, Lh0/p;

    new-instance p1, Lr/i;

    invoke-direct {p1, v3, v7}, Lr/i;-><init>(Lr/e;Lg2/d;)V

    invoke-static {v5, v7, v4, p1, v6}, Ly2/v;->l(Ly2/u;Lg2/a;ILo2/e;I)Ly2/h0;

    iput-object v1, p0, Lr/m;->g:Ljava/lang/Object;

    iput v9, p0, Lr/m;->f:I

    invoke-static {v1, v9, v2, p0}, Lr/p;->a(Lh0/p;ZLh0/g;Li2/a;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_0
    check-cast p1, Lh0/k;

    invoke-virtual {p1}, Lh0/k;->a()V

    sget-object v9, Lr/p;->a:Lr/g;

    iget-object v10, p0, Lr/m;->i:Lq/k;

    if-eq v10, v9, :cond_4

    new-instance v9, Lr/j;

    invoke-direct {v9, v10, v3, p1, v7}, Lr/j;-><init>(Lq/k;Lr/e;Lh0/k;Lg2/d;)V

    invoke-static {v5, v7, v4, v9, v6}, Ly2/v;->l(Ly2/u;Lg2/a;ILo2/e;I)Ly2/h0;

    :cond_4
    iput-object v7, p0, Lr/m;->g:Ljava/lang/Object;

    iput v8, p0, Lr/m;->f:I

    invoke-static {v1, v2, p0}, Lr/p;->b(Lh0/p;Lh0/g;Li2/a;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    return-object v0

    :cond_5
    :goto_1
    check-cast p1, Lh0/k;

    if-nez p1, :cond_6

    new-instance p1, Lr/k;

    invoke-direct {p1, v3, v7}, Lr/k;-><init>(Lr/e;Lg2/d;)V

    invoke-static {v5, v7, v4, p1, v6}, Ly2/v;->l(Ly2/u;Lg2/a;ILo2/e;I)Ly2/h0;

    goto :goto_2

    :cond_6
    invoke-virtual {p1}, Lh0/k;->a()V

    new-instance p1, Lr/l;

    invoke-direct {p1, v3, v7}, Lr/l;-><init>(Lr/e;Lg2/d;)V

    invoke-static {v5, v7, v4, p1, v6}, Ly2/v;->l(Ly2/u;Lg2/a;ILo2/e;I)Ly2/h0;

    iget-object p1, p0, Lr/m;->j:LD/y;

    iget-object p1, p1, LD/y;->f:Ljava/lang/Object;

    check-cast p1, Lq/l;

    iget-boolean v0, p1, Lq/l;->w:Z

    if-eqz v0, :cond_7

    iget-object p1, p1, Lq/l;->x:LA0/c;

    invoke-virtual {p1}, LA0/c;->c()Ljava/lang/Object;

    :cond_7
    :goto_2
    sget-object p1, Lc2/m;->a:Lc2/m;

    return-object p1
.end method
