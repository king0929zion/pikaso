.class public final Lw2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw2/f;


# static fields
.field public static final a:Lw2/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lw2/b;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lw2/b;->a:Lw2/b;

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1

    sget-object v0, Ld2/r;->d:Ld2/r;

    return-object v0
.end method
