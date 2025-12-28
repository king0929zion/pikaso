.class public final Lo0/W0;
.super Li2/j;
.source "SourceFile"

# interfaces
.implements Lo2/e;


# instance fields
.field public h:LA2/a;

.field public i:I

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:Landroid/content/ContentResolver;

.field public final synthetic l:Landroid/net/Uri;

.field public final synthetic m:Lk1/a;

.field public final synthetic n:LA2/b;

.field public final synthetic o:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/ContentResolver;Landroid/net/Uri;Lk1/a;LA2/b;Landroid/content/Context;Lg2/d;)V
    .locals 0

    iput-object p1, p0, Lo0/W0;->k:Landroid/content/ContentResolver;

    iput-object p2, p0, Lo0/W0;->l:Landroid/net/Uri;

    iput-object p3, p0, Lo0/W0;->m:Lk1/a;

    iput-object p4, p0, Lo0/W0;->n:LA2/b;

    iput-object p5, p0, Lo0/W0;->o:Landroid/content/Context;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Li2/j;-><init>(ILg2/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lg2/d;Ljava/lang/Object;)Lg2/d;
    .locals 8

    new-instance v7, Lo0/W0;

    iget-object v4, p0, Lo0/W0;->n:LA2/b;

    iget-object v3, p0, Lo0/W0;->m:Lk1/a;

    iget-object v1, p0, Lo0/W0;->k:Landroid/content/ContentResolver;

    iget-object v2, p0, Lo0/W0;->l:Landroid/net/Uri;

    iget-object v5, p0, Lo0/W0;->o:Landroid/content/Context;

    move-object v0, v7

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lo0/W0;-><init>(Landroid/content/ContentResolver;Landroid/net/Uri;Lk1/a;LA2/b;Landroid/content/Context;Lg2/d;)V

    iput-object p2, v7, Lo0/W0;->j:Ljava/lang/Object;

    return-object v7
.end method

.method public final h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LB2/f;

    check-cast p2, Lg2/d;

    invoke-virtual {p0, p2, p1}, Lo0/W0;->f(Lg2/d;Ljava/lang/Object;)Lg2/d;

    move-result-object p1

    check-cast p1, Lo0/W0;

    sget-object p2, Lc2/m;->a:Lc2/m;

    invoke-virtual {p1, p2}, Lo0/W0;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    sget-object v0, Lh2/a;->d:Lh2/a;

    iget v1, p0, Lo0/W0;->i:I

    iget-object v2, p0, Lo0/W0;->m:Lk1/a;

    const/4 v3, 0x2

    const/4 v4, 0x1

    iget-object v5, p0, Lo0/W0;->k:Landroid/content/ContentResolver;

    if-eqz v1, :cond_3

    if-eq v1, v4, :cond_2

    if-ne v1, v3, :cond_1

    iget-object v1, p0, Lo0/W0;->h:LA2/a;

    iget-object v6, p0, Lo0/W0;->j:Ljava/lang/Object;

    check-cast v6, LB2/f;

    :try_start_0
    invoke-static {p1}, LZ0/d;->U(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    move-object p1, v6

    move-object v6, v1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v1, p0, Lo0/W0;->h:LA2/a;

    iget-object v6, p0, Lo0/W0;->j:Ljava/lang/Object;

    check-cast v6, LB2/f;

    :try_start_1
    invoke-static {p1}, LZ0/d;->U(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :cond_3
    invoke-static {p1}, LZ0/d;->U(Ljava/lang/Object;)V

    iget-object p1, p0, Lo0/W0;->j:Ljava/lang/Object;

    check-cast p1, LB2/f;

    iget-object v1, p0, Lo0/W0;->l:Landroid/net/Uri;

    const/4 v6, 0x0

    invoke-virtual {v5, v1, v6, v2}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    :try_start_2
    iget-object v1, p0, Lo0/W0;->n:LA2/b;

    new-instance v6, LA2/a;

    invoke-direct {v6, v1}, LA2/a;-><init>(LA2/b;)V

    :goto_0
    iput-object p1, p0, Lo0/W0;->j:Ljava/lang/Object;

    iput-object v6, p0, Lo0/W0;->h:LA2/a;

    iput v4, p0, Lo0/W0;->i:I

    invoke-virtual {v6, p0}, LA2/a;->b(Li2/c;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_4

    return-object v0

    :cond_4
    move-object v9, v6

    move-object v6, p1

    move-object p1, v1

    move-object v1, v9

    :goto_1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-virtual {v1}, LA2/a;->c()Ljava/lang/Object;

    iget-object p1, p0, Lo0/W0;->o:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p1

    const-string v7, "animator_duration_scale"

    const/high16 v8, 0x3f800000    # 1.0f

    invoke-static {p1, v7, v8}, Landroid/provider/Settings$Global;->getFloat(Landroid/content/ContentResolver;Ljava/lang/String;F)F

    move-result p1

    new-instance v7, Ljava/lang/Float;

    invoke-direct {v7, p1}, Ljava/lang/Float;-><init>(F)V

    iput-object v6, p0, Lo0/W0;->j:Ljava/lang/Object;

    iput-object v1, p0, Lo0/W0;->h:LA2/a;

    iput v3, p0, Lo0/W0;->i:I

    invoke-interface {v6, v7, p0}, LB2/f;->b(Ljava/lang/Object;Lg2/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-ne p1, v0, :cond_0

    return-object v0

    :cond_5
    invoke-virtual {v5, v2}, Landroid/content/ContentResolver;->unregisterContentObserver(Landroid/database/ContentObserver;)V

    sget-object p1, Lc2/m;->a:Lc2/m;

    return-object p1

    :goto_2
    invoke-virtual {v5, v2}, Landroid/content/ContentResolver;->unregisterContentObserver(Landroid/database/ContentObserver;)V

    throw p1
.end method
