.class public final Lq/k;
.super Li2/j;
.source "SourceFile"

# interfaces
.implements Lo2/f;


# instance fields
.field public h:I

.field public synthetic i:Lr/e;

.field public synthetic j:J

.field public final synthetic k:Lq/l;


# direct methods
.method public constructor <init>(Lq/l;Lg2/d;)V
    .locals 0

    iput-object p1, p0, Lq/k;->k:Lq/l;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Li2/j;-><init>(ILg2/d;)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;Ljava/io/Serializable;)Ljava/lang/Object;
    .locals 3

    check-cast p1, Lr/e;

    check-cast p2, LV/c;

    iget-wide v0, p2, LV/c;->a:J

    check-cast p3, Lg2/d;

    new-instance p2, Lq/k;

    iget-object v2, p0, Lq/k;->k:Lq/l;

    invoke-direct {p2, v2, p3}, Lq/k;-><init>(Lq/l;Lg2/d;)V

    iput-object p1, p2, Lq/k;->i:Lr/e;

    iput-wide v0, p2, Lq/k;->j:J

    sget-object p1, Lc2/m;->a:Lc2/m;

    invoke-virtual {p2, p1}, Lq/k;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    sget-object v0, Lh2/a;->d:Lh2/a;

    iget v1, p0, Lq/k;->h:I

    sget-object v2, Lc2/m;->a:Lc2/m;

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v3, :cond_0

    invoke-static {p1}, LZ0/d;->U(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, LZ0/d;->U(Ljava/lang/Object;)V

    iget-object v4, p0, Lq/k;->i:Lr/e;

    iget-wide v5, p0, Lq/k;->j:J

    iget-object v8, p0, Lq/k;->k:Lq/l;

    iget-boolean p1, v8, Lq/l;->w:Z

    if-eqz p1, :cond_3

    iput v3, p0, Lq/k;->h:I

    iget-object v7, v8, Lq/l;->s:Ls/g;

    if-eqz v7, :cond_2

    new-instance p1, Lq/d;

    const/4 v9, 0x0

    move-object v3, p1

    invoke-direct/range {v3 .. v9}, Lq/d;-><init>(Lr/e;JLs/g;Lq/l;Lg2/d;)V

    invoke-static {p1, p0}, Ly2/v;->b(Lo2/e;Lg2/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    goto :goto_0

    :cond_2
    move-object p1, v2

    :goto_0
    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_1
    return-object v2
.end method
