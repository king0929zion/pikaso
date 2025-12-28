.class public abstract LC2/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:[Lg2/d;

.field public static final b:LD2/w;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    const/4 v0, 0x0

    new-array v0, v0, [Lg2/d;

    sput-object v0, LC2/c;->a:[Lg2/d;

    new-instance v0, LD2/w;

    const-string v1, "NULL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LD2/w;-><init>(Ljava/lang/String;I)V

    sput-object v0, LC2/c;->b:LD2/w;

    return-void
.end method

.method public static final a(Lg2/i;Ljava/lang/Object;Ljava/lang/Object;Lo2/e;Lg2/d;)Ljava/lang/Object;
    .locals 1

    invoke-static {p0, p2}, LD2/a;->m(Lg2/i;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    :try_start_0
    new-instance v0, LC2/y;

    invoke-direct {v0, p4, p0}, LC2/y;-><init>(Lg2/d;Lg2/i;)V

    const/4 p4, 0x2

    invoke-static {p4, p3}, Lp2/r;->c(ILjava/lang/Object;)V

    invoke-interface {p3, p1, v0}, Lo2/e;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {p0, p2}, LD2/a;->g(Lg2/i;Ljava/lang/Object;)V

    return-object p1

    :catchall_0
    move-exception p1

    invoke-static {p0, p2}, LD2/a;->g(Lg2/i;Ljava/lang/Object;)V

    throw p1
.end method
