.class public final Lq/n;
.super Li2/j;
.source "SourceFile"

# interfaces
.implements Lo2/e;


# instance fields
.field public h:I

.field public final synthetic i:Lq/o;


# direct methods
.method public constructor <init>(Lq/o;Lg2/d;)V
    .locals 0

    iput-object p1, p0, Lq/n;->i:Lq/o;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Li2/j;-><init>(ILg2/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lg2/d;Ljava/lang/Object;)Lg2/d;
    .locals 1

    new-instance p2, Lq/n;

    iget-object v0, p0, Lq/n;->i:Lq/o;

    invoke-direct {p2, v0, p1}, Lq/n;-><init>(Lq/o;Lg2/d;)V

    return-object p2
.end method

.method public final h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ly2/u;

    check-cast p2, Lg2/d;

    invoke-virtual {p0, p2, p1}, Lq/n;->f(Lg2/d;Ljava/lang/Object;)Lg2/d;

    move-result-object p1

    check-cast p1, Lq/n;

    sget-object p2, Lc2/m;->a:Lc2/m;

    invoke-virtual {p1, p2}, Lq/n;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    sget-object v0, Lh2/a;->d:Lh2/a;

    iget v1, p0, Lq/n;->h:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, LZ0/d;->U(Ljava/lang/Object;)V

    sget-object p1, Lc2/m;->a:Lc2/m;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, LZ0/d;->U(Ljava/lang/Object;)V

    new-instance v4, Lp2/n;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    new-instance v5, Lp2/n;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    new-instance v6, Lp2/n;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    iget-object v7, p0, Lq/n;->i:Lq/o;

    iget-object p1, v7, Lq/o;->q:Ls/g;

    iget-object p1, p1, Ls/g;->a:LB2/v;

    new-instance v1, LC2/l;

    const/4 v8, 0x1

    move-object v3, v1

    invoke-direct/range {v3 .. v8}, LC2/l;-><init>(Ljava/io/Serializable;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    iput v2, p0, Lq/n;->h:I

    invoke-static {p1, v1, p0}, LB2/v;->i(LB2/v;LB2/f;Lg2/d;)V

    return-object v0
.end method
