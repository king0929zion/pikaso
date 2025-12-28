.class public final LD/r0;
.super Li2/j;
.source "SourceFile"

# interfaces
.implements Lo2/e;


# instance fields
.field public h:I

.field public synthetic i:Ljava/lang/Object;

.field public final synthetic j:LD/u0;

.field public final synthetic k:LD/V;


# direct methods
.method public constructor <init>(LD/u0;LD/V;Lg2/d;)V
    .locals 0

    iput-object p1, p0, LD/r0;->j:LD/u0;

    iput-object p2, p0, LD/r0;->k:LD/V;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Li2/j;-><init>(ILg2/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lg2/d;Ljava/lang/Object;)Lg2/d;
    .locals 3

    new-instance v0, LD/r0;

    iget-object v1, p0, LD/r0;->j:LD/u0;

    iget-object v2, p0, LD/r0;->k:LD/V;

    invoke-direct {v0, v1, v2, p1}, LD/r0;-><init>(LD/u0;LD/V;Lg2/d;)V

    iput-object p2, v0, LD/r0;->i:Ljava/lang/Object;

    return-object v0
.end method

.method public final h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ly2/u;

    check-cast p2, Lg2/d;

    invoke-virtual {p0, p2, p1}, LD/r0;->f(Lg2/d;Ljava/lang/Object;)Lg2/d;

    move-result-object p1

    check-cast p1, LD/r0;

    sget-object p2, Lc2/m;->a:Lc2/m;

    invoke-virtual {p1, p2}, LD/r0;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    sget-object v0, Lh2/a;->d:Lh2/a;

    iget v1, p0, LD/r0;->h:I

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

    iget-object p1, p0, LD/r0;->i:Ljava/lang/Object;

    check-cast p1, Ly2/u;

    iput v2, p0, LD/r0;->h:I

    iget-object v1, p0, LD/r0;->j:LD/u0;

    iget-object v2, p0, LD/r0;->k:LD/V;

    invoke-virtual {v1, p1, v2, p0}, LD/u0;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/io/Serializable;)Ljava/lang/Object;

    return-object v0
.end method
