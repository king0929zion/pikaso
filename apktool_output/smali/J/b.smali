.class public final LJ/b;
.super Ld2/g;
.source "SourceFile"

# interfaces
.implements LG/b;


# static fields
.field public static final g:LJ/b;


# instance fields
.field public final d:Ljava/lang/Object;

.field public final e:Ljava/lang/Object;

.field public final f:LI/c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LJ/b;

    sget-object v1, LK/b;->a:LK/b;

    sget-object v2, LI/c;->f:LI/c;

    invoke-direct {v0, v1, v1, v2}, LJ/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;LI/c;)V

    sput-object v0, LJ/b;->g:LJ/b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Object;LI/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJ/b;->d:Ljava/lang/Object;

    iput-object p2, p0, LJ/b;->e:Ljava/lang/Object;

    iput-object p3, p0, LJ/b;->f:LI/c;

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget-object v0, p0, LJ/b;->f:LI/c;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, v0, LI/c;->e:I

    return v0
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, LJ/b;->f:LI/c;

    invoke-virtual {v0, p1}, LI/c;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 3

    new-instance v0, LJ/c;

    iget-object v1, p0, LJ/b;->d:Ljava/lang/Object;

    iget-object v2, p0, LJ/b;->f:LI/c;

    invoke-direct {v0, v1, v2}, LJ/c;-><init>(Ljava/lang/Object;Ljava/util/Map;)V

    return-object v0
.end method
