.class public final Lr/j;
.super Li2/j;
.source "SourceFile"

# interfaces
.implements Lo2/e;


# instance fields
.field public h:I

.field public final synthetic i:Lq/k;

.field public final synthetic j:Lr/e;

.field public final synthetic k:Lh0/k;


# direct methods
.method public constructor <init>(Lq/k;Lr/e;Lh0/k;Lg2/d;)V
    .locals 0

    iput-object p1, p0, Lr/j;->i:Lq/k;

    iput-object p2, p0, Lr/j;->j:Lr/e;

    iput-object p3, p0, Lr/j;->k:Lh0/k;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Li2/j;-><init>(ILg2/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lg2/d;Ljava/lang/Object;)Lg2/d;
    .locals 3

    new-instance p2, Lr/j;

    iget-object v0, p0, Lr/j;->j:Lr/e;

    iget-object v1, p0, Lr/j;->i:Lq/k;

    iget-object v2, p0, Lr/j;->k:Lh0/k;

    invoke-direct {p2, v1, v0, v2, p1}, Lr/j;-><init>(Lq/k;Lr/e;Lh0/k;Lg2/d;)V

    return-object p2
.end method

.method public final h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ly2/u;

    check-cast p2, Lg2/d;

    invoke-virtual {p0, p2, p1}, Lr/j;->f(Lg2/d;Ljava/lang/Object;)Lg2/d;

    move-result-object p1

    check-cast p1, Lr/j;

    sget-object p2, Lc2/m;->a:Lc2/m;

    invoke-virtual {p1, p2}, Lr/j;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    sget-object v0, Lh2/a;->d:Lh2/a;

    iget v1, p0, Lr/j;->h:I

    sget-object v2, Lc2/m;->a:Lc2/m;

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v3, :cond_0

    invoke-static {p1}, LZ0/d;->U(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, LZ0/d;->U(Ljava/lang/Object;)V

    iget-object p1, p0, Lr/j;->k:Lh0/k;

    iget-wide v4, p1, Lh0/k;->c:J

    iput v3, p0, Lr/j;->h:I

    iget-object p1, p0, Lr/j;->i:Lq/k;

    iget-object v1, p0, Lr/j;->j:Lr/e;

    new-instance v3, Lq/k;

    iget-object p1, p1, Lq/k;->k:Lq/l;

    invoke-direct {v3, p1, p0}, Lq/k;-><init>(Lq/l;Lg2/d;)V

    iput-object v1, v3, Lq/k;->i:Lr/e;

    iput-wide v4, v3, Lq/k;->j:J

    invoke-virtual {v3, v2}, Lq/k;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    return-object v2
.end method
